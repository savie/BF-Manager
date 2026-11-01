.class public final Ll/֨᩸;
.super Ljava/lang/Object;
.source "25PA"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# static fields
.field public static ۚۢۧ:Z


# instance fields
.field public final synthetic ۙ:Ll/ۜ᩸;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Ll/ۜ᩸;)V
    .locals 0

    .line 1405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩸;->ۙ:Ll/ۜ᩸;

    return-void
.end method

.method public static ۗ֫ܿ()Landroid/app/Application;
    .locals 1

    invoke-static {}, Ll/ܽܺۘ;->ۚ()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public static ۗܰۘ(Ljava/lang/Object;)Ll/᩷۠ۚ;
    .locals 0

    check-cast p0, Ll/᩷۠ۚ;

    invoke-static {p0}, Ll/ܶۗ֨;->᩹(Ll/᩷۠ۚ;)Ll/᩷۠ۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙܺۧ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    check-cast p0, Ljava/util/IdentityHashMap;

    invoke-virtual {p0}, Ljava/util/IdentityHashMap;->keySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ۛ᩶ۡ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-static {p0}, Ll/᩵ۧ᩺;->ۙ(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public static ۡ֫ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۧᩳۘ(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ۫ۜܽ([SIII)Ljava/lang/String;
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

.method public static ۬۟᩶()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ܰ۟᩵(IILjava/lang/Object;)V
    .locals 0

    check-cast p2, [B

    invoke-static {p0, p1, p2}, Ll/ܶۢ᩺;->ۙ(II[B)V

    return-void
.end method

.method public static ܶ᩷۬(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۧܺۖ;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Ll/ۧܺۖ;->append(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ܺܳۖ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/۠ۡۜ;

    invoke-virtual {p0, p1}, Ll/۠ۡۜ;->ܰ(I)V

    return-void
.end method

.method public static ᩵۫ᩳ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method

.method public static ᩶۬᩹(Ljava/lang/Object;I)I
    .locals 0

    check-cast p0, Landroid/content/res/Resources$Theme;

    invoke-static {p0, p1}, Ll/ܺ᩵ۘ;->ܰ(Landroid/content/res/Resources$Theme;I)I

    move-result p0

    return p0
.end method

.method public static ᩷ܺ֨(JJ)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ᩷᩷ۛ(Ljava/lang/Object;I)Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩹ۖ᩺(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/ᩳ۟ۜ;

    invoke-virtual {p0, p1}, Ll/ᩳ۟ۜ;->᩺(I)V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 3

    .line 1416
    iget-object p1, p0, Ll/֨᩸;->ۙ:Ll/ۜ᩸;

    iget-object v0, p1, Ll/ۜ᩸;->ۜۙ:Ll/ۘ᩸;

    iget-object v1, p1, Ll/ۜ᩸;->ۘۙ:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    if-ne p2, v2, :cond_1

    .line 867
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result p2

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    return-void

    .line 1417
    :cond_0
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 1418
    iget-object p1, p1, Ll/ۜ᩸;->ۗ:Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1419
    invoke-virtual {v0}, Ll/ۘ᩸;->run()V

    :cond_1
    return-void
.end method
