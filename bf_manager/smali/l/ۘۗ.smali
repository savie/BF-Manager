.class public Ll/ۘۗ;
.super Ljava/lang/Object;
.source "K4SO"


# static fields
.field public static ۖۧ۬:I


# instance fields
.field public final ۙ:Landroid/view/accessibility/AccessibilityNodeProvider;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>()V
    .locals 2

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 120
    new-instance v0, Ll/۬ۗ;

    .line 96
    invoke-direct {v0, p0}, Ll/֨ۗ;-><init>(Ll/ۘۗ;)V

    .line 120
    iput-object v0, p0, Ll/ۘۗ;->ۙ:Landroid/view/accessibility/AccessibilityNodeProvider;

    return-void

    .line 122
    :cond_0
    new-instance v0, Ll/֨ۗ;

    invoke-direct {v0, p0}, Ll/֨ۗ;-><init>(Ll/ۘۗ;)V

    iput-object v0, p0, Ll/ۘۗ;->ۙ:Landroid/view/accessibility/AccessibilityNodeProvider;

    return-void
.end method

.method public constructor <init>(Landroid/view/accessibility/AccessibilityNodeProvider;)V
    .locals 0

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, Ll/ۘۗ;->ۙ:Landroid/view/accessibility/AccessibilityNodeProvider;

    return-void
.end method

.method public static ֡᩶ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫ۧܿ(Ljava/lang/Object;)Landroid/view/Window;
    .locals 0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    return-object p0
.end method

.method public static ֫᩺۟(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p0

    return p0
.end method

.method public static ۖۛ۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩺ۢ᩺;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/᩺ۢ᩺;->ۙ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۘ֫᩵(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/io/Closeable;

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public static ۘ᩹ۨ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ܿ۬ۨ;

    invoke-virtual {p0}, Ll/ܿ۬ۨ;->᩹()Z

    move-result p0

    return p0
.end method

.method public static ۙۖۢ(Ljava/lang/Object;)J
    .locals 1

    check-cast p0, Ll/۫֫᩺;

    invoke-virtual {p0}, Ll/۫֫᩺;->getSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ۠ۘۛ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܿۧ᩺;

    invoke-interface {p0}, Ll/ܿۧ᩺;->apply()V

    return-void
.end method

.method public static ۡ᩸ܺ(Ljava/lang/Object;)B
    .locals 0

    check-cast p0, Ll/ܿ۬ۨ;

    invoke-virtual {p0}, Ll/ܿ۬ۨ;->readByte()B

    move-result p0

    return p0
.end method

.method public static ۨ᩻᩵(Ljava/lang/Object;I)Landroid/view/MenuItem;
    .locals 0

    check-cast p0, Landroid/view/Menu;

    invoke-interface {p0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p0

    return-object p0
.end method

.method public static ۬۫ܿ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static ܰܿܽ(Ljava/lang/Object;II)V
    .locals 0

    check-cast p0, Ll/ܺܶ᩺;

    invoke-virtual {p0, p1, p2}, Ll/ܺܶ᩺;->ۙ(II)V

    return-void
.end method

.method public static ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ᩴۛܰ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ll/۠֡ۚ;

    invoke-virtual {p0}, Ll/۠֡ۚ;->ۖ()I

    move-result p0

    return p0
.end method

.method public static ᩺ۛۙ([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ᩻ۗۖ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final ۙ()Ljava/lang/Object;
    .locals 1

    .line 141
    iget-object v0, p0, Ll/ۘۗ;->ۙ:Landroid/view/accessibility/AccessibilityNodeProvider;

    return-object v0
.end method

.method public ۙ(I)Ll/᩹ۗ;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۙ(IILandroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public ܰ(I)Ll/᩹ۗ;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
