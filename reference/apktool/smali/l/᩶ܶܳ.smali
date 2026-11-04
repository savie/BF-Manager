.class public final Ll/᩶ܶܳ;
.super Ljava/lang/Object;
.source "J6IU"


# static fields
.field public static final ۗ:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public ֫:Z

.field public ۙ:Z

.field public final ۚ:Landroid/os/Handler;

.field public final ۤ:Landroid/view/ContextThemeWrapper;

.field public final ۧ:Ll/֫ܶܳ;

.field public ۫:Ll/֨ܽܳ;

.field public final ܳ:Ll/ۘܶܳ;

.field public volatile ܶ:Z

.field public final ܺ:Ll/᩸᩹ܳ;

.field public final ܽ:Landroid/accessibilityservice/AccessibilityService;

.field public volatile ᩴ:I

.field public ᩷:Ll/ۚ᩹ܳ;

.field public ᩸:Ll/᩺ܶܳ;

.field public final ᩹:Ll/ۚܺܳ;

.field public final ᩻:Ll/֡۠֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9a

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    .line 36
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ll/᩶ܶܳ;->ۗ:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/view/ContextThemeWrapper;Ll/֡۠֫;Ll/ۚܺܳ;Ll/ܽܺܳ;)V
    .locals 2

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/᩶ܶܳ;->ۚ:Landroid/os/Handler;

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Ll/᩶ܶܳ;->֫:Z

    .line 81
    iput-object p1, p0, Ll/᩶ܶܳ;->ۤ:Landroid/view/ContextThemeWrapper;

    .line 82
    new-instance v0, Ll/᩸᩹ܳ;

    invoke-direct {v0, p1}, Ll/᩸᩹ܳ;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, Ll/᩶ܶܳ;->ܺ:Ll/᩸᩹ܳ;

    .line 83
    iput-object p2, p0, Ll/᩶ܶܳ;->᩻:Ll/֡۠֫;

    .line 84
    iput-object p3, p0, Ll/᩶ܶܳ;->᩹:Ll/ۚܺܳ;

    .line 85
    iput-object p4, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    .line 86
    iget-object p2, p2, Ll/֡۠֫;->ܰ:Ljava/lang/Object;

    check-cast p2, Ll/ܽܺܳ;

    invoke-virtual {p2}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object p2

    iput-object p2, p0, Ll/᩶ܶܳ;->ܽ:Landroid/accessibilityservice/AccessibilityService;

    .line 87
    new-instance p2, Ll/֫ܶܳ;

    invoke-direct {p2, p1, p0}, Ll/֫ܶܳ;-><init>(Landroid/view/ContextThemeWrapper;Ll/᩶ܶܳ;)V

    iput-object p2, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    return-void
.end method

.method public static ۙ(Ll/᩶ܶܳ;)Landroid/accessibilityservice/AccessibilityService;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/᩶ܶܳ;->᩻:Ll/֡۠֫;

    iget-object v0, v0, Ll/֡۠֫;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    iget-object p0, p0, Ll/᩶ܶܳ;->ܽ:Landroid/accessibilityservice/AccessibilityService;

    if-ne v0, p0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private ۙ(I)V
    .locals 2

    .line 290
    iget v0, p0, Ll/᩶ܶܳ;->ᩴ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩶ܶܳ;->ᩴ:I

    .line 291
    iget-object v0, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    invoke-virtual {v0, p1}, Ll/֫ܶܳ;->ۙ(I)V

    .line 292
    iget-object p1, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast p1, Ll/ܽܺܳ;

    invoke-virtual {p1, v1}, Ll/ܽܺܳ;->ۙ(Z)V

    return-void
.end method

.method private ۙ(Ll/ܳ᩹ܳ;)V
    .locals 9

    .line 255
    new-instance v0, Ll/֨ܽܳ;

    iget-object v1, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۧܶܳ;

    invoke-direct {v2, v1}, Ll/ۧܶܳ;-><init>(Ll/֫ܶܳ;)V

    iget-object v1, p0, Ll/᩶ܶܳ;->ۤ:Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, v1, p1, v2}, Ll/֨ܽܳ;-><init>(Landroid/view/ContextThemeWrapper;Ll/ܳ᩹ܳ;Ll/ۧܶܳ;)V

    iput-object v0, p0, Ll/᩶ܶܳ;->۫:Ll/֨ܽܳ;

    .line 256
    invoke-virtual {p0}, Ll/᩶ܶܳ;->ܺ()V

    .line 257
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    .line 259
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_0

    const/16 v2, 0x7f6

    const/16 v6, 0x7f6

    goto :goto_0

    :cond_0
    const/16 v2, 0x7d3

    const/16 v6, 0x7d3

    :goto_0
    const/16 v7, 0x108

    const/4 v8, -0x3

    const/4 v4, -0x1

    const/4 v5, -0x1

    move-object v3, p1

    .line 260
    invoke-direct/range {v3 .. v8}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    const/16 v2, 0x33

    .line 263
    iput v2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_1

    const/4 v0, 0x1

    .line 265
    invoke-static {p1, v0}, Ll/ۚܽۤ;->ۙ(Landroid/view/WindowManager$LayoutParams;I)V

    :cond_1
    const-string v0, "window"

    .line 266
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iget-object v1, p0, Ll/᩶ܶܳ;->۫:Ll/֨ܽܳ;

    invoke-interface {v0, v1, p1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static ۙ(Ll/᩶ܶܳ;I)V
    .locals 2

    .line 215
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 216
    iput-boolean v0, p0, Ll/᩶ܶܳ;->ۙ:Z

    const/4 v1, 0x1

    .line 217
    iput-boolean v1, p0, Ll/᩶ܶܳ;->֫:Z

    const/4 v1, 0x3

    .line 218
    invoke-direct {p0, v1}, Ll/᩶ܶܳ;->᩷(I)V

    .line 219
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    return-void

    .line 220
    :cond_1
    iget-object p1, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    invoke-virtual {p1, v0}, Ll/֫ܶܳ;->ۙ(Z)V

    .line 221
    iget-object p1, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast p1, Ll/ܽܺܳ;

    invoke-virtual {p1, v0}, Ll/ܽܺܳ;->ۙ(Z)V

    .line 250
    invoke-direct {p0}, Ll/᩶ܶܳ;->ܽ()V

    const p1, 0x7f120552

    .line 251
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۙ(I)V

    return-void
.end method

.method public static ۙ(Ll/᩶ܶܳ;ILjava/lang/Exception;Z)V
    .locals 2

    .line 142
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 143
    iput-boolean v0, p0, Ll/᩶ܶܳ;->ۙ:Z

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 144
    :goto_0
    iput-boolean v1, p0, Ll/᩶ܶܳ;->֫:Z

    if-nez p2, :cond_2

    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    const/4 v1, 0x3

    .line 145
    :goto_1
    invoke-direct {p0, v1}, Ll/᩶ܶܳ;->᩷(I)V

    .line 146
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    .line 147
    :cond_3
    iget-object p1, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    invoke-virtual {p1, v0}, Ll/֫ܶܳ;->ۙ(Z)V

    .line 148
    iget-object p1, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast p1, Ll/ܽܺܳ;

    invoke-virtual {p1, v0}, Ll/ܽܺܳ;->ۙ(Z)V

    if-eqz p2, :cond_4

    .line 250
    invoke-direct {p0}, Ll/᩶ܶܳ;->ܽ()V

    const p1, 0x7f120552

    .line 251
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۙ(I)V

    return-void

    :cond_4
    if-eqz p3, :cond_5

    .line 150
    invoke-virtual {p0}, Ll/᩶ܶܳ;->ۙ()V

    :cond_5
    :goto_2
    return-void
.end method

.method public static synthetic ۙ(Ll/᩶ܶܳ;ILl/ܳ᩹ܳ;Ljava/util/Map;)V
    .locals 0

    .line 238
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    invoke-virtual {p0, p2, p3}, Ll/֫ܶܳ;->ۙ(Ll/ܳ᩹ܳ;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public static synthetic ۙ(Ll/᩶ܶܳ;ILl/᩺ܶܳ;Ll/ܰܶܳ;J)V
    .locals 8

    .line 178
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 179
    :cond_0
    new-instance v0, Ll/ۗܶܳ;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Ll/ۗܶܳ;-><init>(Ll/᩶ܶܳ;ILl/᩺ܶܳ;Ll/ܰܶܳ;J)V

    sget-object p0, Ll/᩶ܶܳ;->ۗ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۙ(Ll/᩶ܶܳ;ILl/᩺ܶܳ;Ll/ܰܶܳ;Ll/ܳ᩹ܳ;)V
    .locals 5

    .line 183
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    iget-object v1, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 184
    iput-boolean v2, p0, Ll/᩶ܶܳ;->ۙ:Z

    const/4 v3, 0x2

    .line 185
    invoke-direct {p0, v3}, Ll/᩶ܶܳ;->᩷(I)V

    .line 186
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    return-void

    .line 187
    :cond_1
    invoke-virtual {v1, v2}, Ll/֫ܶܳ;->ۙ(Z)V

    .line 188
    move-object v3, v0

    check-cast v3, Ll/ܽܺܳ;

    invoke-virtual {v3, v2}, Ll/ܽܺܳ;->ۙ(Z)V

    .line 295
    iget-object v2, p0, Ll/᩶ܶܳ;->ۤ:Landroid/view/ContextThemeWrapper;

    const-string v3, "window"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    .line 302
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 303
    invoke-virtual {v2, v3}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 304
    iget v4, p2, Ll/᩺ܶܳ;->ۙ:I

    invoke-virtual {v2}, Landroid/view/Display;->getRotation()I

    move-result v2

    if-ne v4, v2, :cond_3

    iget-object v2, p2, Ll/᩺ܶܳ;->᩷:Landroid/graphics/Point;

    invoke-virtual {v2, v3}, Landroid/graphics/Point;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 193
    iput-object p2, p0, Ll/᩶ܶܳ;->᩸:Ll/᩺ܶܳ;

    .line 194
    iget-object p2, p0, Ll/᩶ܶܳ;->᩹:Ll/ۚܺܳ;

    iget-object p2, p2, Ll/ۚܺܳ;->ܰ:Ll/ܽܺܳ;

    invoke-static {p2}, Ll/ܽܺܳ;->ۙ(Ll/ܽܺܳ;)Ll/ܰܶܳ;

    move-result-object p2

    if-eqz p3, :cond_2

    .line 199
    iget-object v2, p3, Ll/ܰܶܳ;->ۙ:Ljava/lang/String;

    iget-object p3, p3, Ll/ܰܶܳ;->᩷:Ljava/lang/String;

    if-eqz p2, :cond_2

    iget-object v3, p2, Ll/ܰܶܳ;->᩷:Ljava/lang/String;

    .line 197
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object p2, p2, Ll/ܰܶܳ;->ۙ:Ljava/lang/String;

    .line 198
    invoke-static {v2, p2}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p4, Ll/ܳ᩹ܳ;->᩷:Ljava/util/Set;

    .line 199
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 202
    :goto_1
    :try_start_0
    invoke-direct {p0, p4}, Ll/᩶ܶܳ;->ۙ(Ll/ܳ᩹ܳ;)V

    .line 203
    invoke-virtual {v1, p4, v2}, Ll/֫ܶܳ;->ۙ(Ll/ܳ᩹ܳ;Ljava/lang/String;)V

    .line 204
    check-cast v0, Ll/ܽܺܳ;

    const/4 p2, 0x1

    invoke-virtual {v0, p2}, Ll/ܽܺܳ;->ۙ(Z)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    iget-object p2, p4, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    .line 210
    invoke-interface {p2}, Ljava/util/List;->size()I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 234
    new-instance p2, Ll/ۛܶܳ;

    invoke-direct {p2, p0, p4, p1}, Ll/ۛܶܳ;-><init>(Ll/᩶ܶܳ;Ll/ܳ᩹ܳ;I)V

    sget-object p0, Ll/᩶ܶܳ;->ۗ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 250
    :catch_0
    invoke-direct {p0}, Ll/᩶ܶܳ;->ܽ()V

    const p1, 0x7f120552

    .line 251
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۙ(I)V

    return-void

    :cond_3
    const p1, 0x7f120553

    .line 190
    invoke-direct {p0, p1}, Ll/᩶ܶܳ;->ۙ(I)V

    return-void
.end method

.method public static ۙ(Ll/᩶ܶܳ;IZ)V
    .locals 3

    .line 317
    :try_start_0
    iget-object v0, p0, Ll/᩶ܶܳ;->᩷:Ll/ۚ᩹ܳ;

    const/4 v1, 0x0

    .line 318
    iput-object v1, p0, Ll/᩶ܶܳ;->᩷:Ll/ۚ᩹ܳ;

    if-eqz v0, :cond_0

    .line 319
    invoke-virtual {v0}, Ll/ۚ᩹ܳ;->close()V

    .line 136
    :cond_0
    new-instance v0, Ll/ۛۤᩴ;

    invoke-direct {v0, p0}, Ll/ۛۤᩴ;-><init>(Ljava/lang/Object;)V

    .line 33
    new-instance v2, Ll/۟ܽܳ;

    invoke-direct {v2, v0}, Ll/۟ܽܳ;-><init>(Ll/ۛۤᩴ;)V

    .line 136
    iput-object v2, p0, Ll/᩶ܶܳ;->᩷:Ll/ۚ᩹ܳ;

    .line 138
    invoke-virtual {v2}, Ll/ۚ᩹ܳ;->᩷()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 141
    :goto_0
    iget-object v0, p0, Ll/᩶ܶܳ;->ۚ:Landroid/os/Handler;

    new-instance v2, Ll/᩹ܶܳ;

    invoke-direct {v2, p0, p1, v1, p2}, Ll/᩹ܶܳ;-><init>(Ll/᩶ܶܳ;ILjava/lang/Exception;Z)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ۙ(Ll/᩶ܶܳ;Ll/ܳ᩹ܳ;I)V
    .locals 3

    .line 236
    :try_start_0
    iget-object v0, p0, Ll/᩶ܶܳ;->ܺ:Ll/᩸᩹ܳ;

    new-instance v1, Ll/᩻ܶܳ;

    invoke-direct {v1, p0, p2}, Ll/᩻ܶܳ;-><init>(Ll/᩶ܶܳ;I)V

    invoke-virtual {v0, p1, v1}, Ll/᩸᩹ܳ;->ۙ(Ll/ܳ᩹ܳ;Ll/᩻ܶܳ;)Ljava/util/Map;

    move-result-object v0

    .line 237
    iget-object v1, p0, Ll/᩶ܶܳ;->ۚ:Landroid/os/Handler;

    new-instance v2, Ll/ܺܶܳ;

    invoke-direct {v2, p0, p2, p1, v0}, Ll/ܺܶܳ;-><init>(Ll/᩶ܶܳ;ILl/ܳ᩹ܳ;Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private native ۙ(Z)V
.end method

.method private ۤ(I)Z
    .locals 1

    .line 229
    iget-boolean v0, p0, Ll/᩶ܶܳ;->ܶ:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/᩶ܶܳ;->ᩴ:I

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/᩶ܶܳ;->᩻:Ll/֡۠֫;

    .line 230
    iget-object p1, p1, Ll/֡۠֫;->ܰ:Ljava/lang/Object;

    check-cast p1, Ll/ܽܺܳ;

    invoke-virtual {p1}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object p1

    iget-object v0, p0, Ll/᩶ܶܳ;->ܽ:Landroid/accessibilityservice/AccessibilityService;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private ܽ()V
    .locals 2

    .line 281
    iget-object v0, p0, Ll/᩶ܶܳ;->۫:Ll/֨ܽܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 282
    iget-object v0, p0, Ll/᩶ܶܳ;->ۤ:Landroid/view/ContextThemeWrapper;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    iget-object v1, p0, Ll/᩶ܶܳ;->۫:Ll/֨ܽܳ;

    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v0, 0x0

    .line 283
    iput-object v0, p0, Ll/᩶ܶܳ;->۫:Ll/֨ܽܳ;

    .line 284
    iput-object v0, p0, Ll/᩶ܶܳ;->᩸:Ll/᩺ܶܳ;

    return-void
.end method

.method private ᩷(I)V
    .locals 1

    .line 287
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0, p0, p1}, Ll/ܽܺܳ;->ۙ(Ll/᩶ܶܳ;I)V

    return-void
.end method

.method public static ᩷(Ll/᩶ܶܳ;)V
    .locals 2

    .line 323
    iget-object v0, p0, Ll/᩶ܶܳ;->ܺ:Ll/᩸᩹ܳ;

    invoke-virtual {v0}, Ll/᩸᩹ܳ;->ۙ()V

    .line 317
    :try_start_0
    iget-object v0, p0, Ll/᩶ܶܳ;->᩷:Ll/ۚ᩹ܳ;

    const/4 v1, 0x0

    .line 318
    iput-object v1, p0, Ll/᩶ܶܳ;->᩷:Ll/ۚ᩹ܳ;

    if-eqz v0, :cond_0

    .line 319
    invoke-virtual {v0}, Ll/ۚ᩹ܳ;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static synthetic ᩷(Ll/᩶ܶܳ;ILl/᩺ܶܳ;Ll/ܰܶܳ;J)V
    .locals 10

    .line 181
    iget-object v0, p0, Ll/᩶ܶܳ;->ۚ:Landroid/os/Handler;

    :try_start_0
    iget-object v1, p0, Ll/᩶ܶܳ;->᩷:Ll/ۚ᩹ܳ;

    invoke-virtual {v1}, Ll/ۚ᩹ܳ;->ۙ()Ll/ܳ᩹ܳ;

    move-result-object v7

    .line 182
    new-instance v1, Ll/᩵ܶܳ;

    move-object v2, v1

    move-object v3, p0

    move v4, p1

    move-object v5, p2

    move-object v6, p3

    move-wide v8, p4

    invoke-direct/range {v2 .. v9}, Ll/᩵ܶܳ;-><init>(Ll/᩶ܶܳ;ILl/᩺ܶܳ;Ll/ܰܶܳ;Ll/ܳ᩹ܳ;J)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    .line 214
    new-instance p3, Ll/ۨܶܳ;

    invoke-direct {p3, p0, p1, p2}, Ll/ۨܶܳ;-><init>(Ll/᩶ܶܳ;ILjava/lang/Exception;)V

    invoke-virtual {v0, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ᩷(Ll/᩶ܶܳ;I)Z
    .locals 1

    .line 236
    iget-boolean v0, p0, Ll/᩶ܶܳ;->ܶ:Z

    if-nez v0, :cond_1

    iget p0, p0, Ll/᩶ܶܳ;->ᩴ:I

    if-eq p1, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 104
    iget-boolean v0, p0, Ll/᩶ܶܳ;->ܶ:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/᩶ܶܳ;->᩻:Ll/֡۠֫;

    iget-object v0, v0, Ll/֡۠֫;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    iget-object v1, p0, Ll/᩶ܶܳ;->ܽ:Landroid/accessibilityservice/AccessibilityService;

    if-ne v0, v1, :cond_3

    .line 105
    invoke-static {v1}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 109
    :cond_0
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v0, Ll/ܽܺܳ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܽܺܳ;->ۙ(Z)V

    .line 110
    iget-boolean v0, p0, Ll/᩶ܶܳ;->֫:Z

    if-eqz v0, :cond_1

    invoke-direct {p0, v1}, Ll/᩶ܶܳ;->ۙ(Z)V

    return-void

    .line 112
    :cond_1
    iget-boolean v0, p0, Ll/᩶ܶܳ;->ۙ:Z

    if-nez v0, :cond_2

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Ll/᩶ܶܳ;->᩷(I)V

    :cond_2
    return-void

    .line 106
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ll/᩶ܶܳ;->᩷()V

    return-void
.end method

.method public final ۙ(Landroid/widget/TextView;)Ll/ܿܽ;
    .locals 1

    .line 94
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0, p1}, Ll/ܽܺܳ;->ۙ(Landroid/view/View;)Ll/ܿܽ;

    move-result-object p1

    return-object p1
.end method

.method public native ۙ()V
.end method

.method public final ۙ(Ll/۠ܶܳ;)V
    .locals 1

    .line 95
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0, p1}, Ll/ܽܺܳ;->ۙ(Ll/۠ܶܳ;)V

    return-void
.end method

.method public final ۚ()V
    .locals 4

    .line 310
    iget-object v0, p0, Ll/᩶ܶܳ;->᩸:Ll/᩺ܶܳ;

    if-eqz v0, :cond_1

    .line 295
    iget-object v1, p0, Ll/᩶ܶܳ;->ۤ:Landroid/view/ContextThemeWrapper;

    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    .line 302
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 303
    invoke-virtual {v1, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 304
    iget v3, v0, Ll/᩺ܶܳ;->ۙ:I

    invoke-virtual {v1}, Landroid/view/Display;->getRotation()I

    move-result v1

    if-ne v3, v1, :cond_0

    iget-object v0, v0, Ll/᩺ܶܳ;->᩷:Landroid/graphics/Point;

    invoke-virtual {v0, v2}, Landroid/graphics/Point;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 311
    :cond_0
    invoke-direct {p0}, Ll/᩶ܶܳ;->ܽ()V

    const v0, 0x7f120553

    .line 312
    invoke-direct {p0, v0}, Ll/᩶ܶܳ;->ۙ(I)V

    :cond_1
    return-void
.end method

.method public final ۤ()Ll/֫ܶܳ;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    return-object v0
.end method

.method public final ۧ()V
    .locals 4

    .line 271
    iget-boolean v0, p0, Ll/᩶ܶܳ;->ܶ:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 272
    :cond_0
    iget v0, p0, Ll/᩶ܶܳ;->ᩴ:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Ll/᩶ܶܳ;->ᩴ:I

    const/4 v2, 0x0

    .line 273
    iput-boolean v2, p0, Ll/᩶ܶܳ;->ۙ:Z

    .line 274
    invoke-direct {p0}, Ll/᩶ܶܳ;->ܽ()V

    .line 275
    iget-object v3, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    invoke-virtual {v3}, Ll/֫ܶܳ;->ۙ()V

    .line 276
    iget-object v3, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v3, Ll/ܽܺܳ;

    invoke-virtual {v3, v1}, Ll/ܽܺܳ;->ۙ(Z)V

    .line 277
    invoke-direct {p0, v0}, Ll/᩶ܶܳ;->ۤ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/᩶ܶܳ;->֫:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    invoke-direct {p0, v2}, Ll/᩶ܶܳ;->᩷(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۫()V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0}, Ll/ܽܺܳ;->ܽ()V

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 92
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0}, Ll/ܽܺܳ;->ܺ()Z

    move-result v0

    return v0
.end method

.method public final ܺ()V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/᩶ܶܳ;->۫:Ll/֨ܽܳ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v1, Ll/ܽܺܳ;

    invoke-virtual {v1}, Ll/ܽܺܳ;->ۚ()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    return-void
.end method

.method public final ᩴ()Z
    .locals 1

    .line 116
    iget-boolean v0, p0, Ll/᩶ܶܳ;->ܶ:Z

    return v0
.end method

.method public final ᩷()V
    .locals 3

    .line 330
    iget-boolean v0, p0, Ll/᩶ܶܳ;->ܶ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 331
    iput-boolean v0, p0, Ll/᩶ܶܳ;->ܶ:Z

    .line 332
    iget v1, p0, Ll/᩶ܶܳ;->ᩴ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/᩶ܶܳ;->ᩴ:I

    const/4 v0, 0x0

    .line 333
    iput-boolean v0, p0, Ll/᩶ܶܳ;->ۙ:Z

    .line 334
    invoke-direct {p0}, Ll/᩶ܶܳ;->ܽ()V

    .line 335
    iget-object v0, p0, Ll/᩶ܶܳ;->ۧ:Ll/֫ܶܳ;

    invoke-virtual {v0}, Ll/֫ܶܳ;->ۙ()V

    .line 336
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0, p0}, Ll/ܽܺܳ;->ۙ(Ll/᩶ܶܳ;)V

    .line 337
    sget-object v0, Ll/᩶ܶܳ;->ۗ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/᩻֫᩸;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0}, Ll/᩻֫᩸;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩸()Ll/֨ܽܳ;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/᩶ܶܳ;->۫:Ll/֨ܽܳ;

    return-object v0
.end method

.method public final ᩻()V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/᩶ܶܳ;->ܳ:Ll/ۘܶܳ;

    check-cast v0, Ll/ܽܺܳ;

    invoke-virtual {v0}, Ll/ܽܺܳ;->ۛ()V

    return-void
.end method
