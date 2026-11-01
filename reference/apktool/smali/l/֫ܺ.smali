.class public final Ll/֫ܺ;
.super Ljava/lang/Object;
.source "S6AR"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# static fields
.field public static ۜ᩶ܽ:Z


# instance fields
.field public final synthetic ܺ:Ll/ۖ᩶;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Ll/ۖ᩶;)V
    .locals 0

    .line 3218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ܺ;->ܺ:Ll/ۖ᩶;

    return-void
.end method

.method public static ֡ۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Ljava/util/IdentityHashMap;

    invoke-virtual {p0, p1, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ֨ۗܿ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Landroid/widget/CompoundButton;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    return p0
.end method

.method public static ۖܰۘ(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p0, Landroid/widget/CompoundButton;

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

.method public static ۙ֡ۛ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۚۗ᩵(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    check-cast p0, Ljava/lang/Throwable;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static ۠ܰᩴ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ۢۤܽ(Ljava/lang/Object;)Ll/ۚ֫ᩴ;
    .locals 0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Ll/ۡܿᩴ;->stream(Ljava/util/Collection;)Ll/ۚ֫ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ۬ܺۡ(Ljava/lang/Object;Ljava/lang/Object;)Ll/۫֫᩺;
    .locals 0

    check-cast p0, Ll/ۖۢ᩺;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۖۢ᩺;->getEntry(Ljava/lang/String;)Ll/۫֫᩺;

    move-result-object p0

    return-object p0
.end method

.method public static ܺ᩺᩻(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/᩷۠ۚ;

    invoke-virtual {p0}, Ll/᩷۠ۚ;->ܶۙ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܿۗ۠(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static ܿᩳ᩶(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p0

    return p0
.end method

.method public static ܿ᩵᩻(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static ᩳܺۢ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static ᩶֫ۙ([SIII)Ljava/lang/String;
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

.method public static ᩹ۛۙ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Throwable;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ᩹᩷ۧ(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Ll/ܰ֡۠;->ۙ(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 3223
    iget-object v0, p0, Ll/֫ܺ;->ܺ:Ll/ۖ᩶;

    iget-object v0, v0, Ll/ۖ᩶;->mOnHierarchyChangeListener:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    if-eqz v0, :cond_0

    .line 3224
    invoke-interface {v0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewAdded(Landroid/view/View;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x2

    .line 3230
    iget-object v1, p0, Ll/֫ܺ;->ܺ:Ll/ۖ᩶;

    invoke-virtual {v1, v0}, Ll/ۖ᩶;->onChildViewsChanged(I)V

    .line 3232
    iget-object v0, v1, Ll/ۖ᩶;->mOnHierarchyChangeListener:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    if-eqz v0, :cond_0

    .line 3233
    invoke-interface {v0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V

    :cond_0
    return-void
.end method
