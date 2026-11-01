.class public final Ll/֡᩶;
.super Ljava/lang/Object;
.source "X4NC"


# static fields
.field public static ۗ֨ܺ:I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ۗᩴۛ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static ۘᩴܰ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/᩷۠ۚ;

    invoke-virtual {p0}, Ll/᩷۠ۚ;->ܶۙ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .line 170
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 171
    const-class v0, Landroid/app/AppOpsManager;

    invoke-static {p0, v0}, Ll/ܺ᩶;->ۙ(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AppOpsManager;

    .line 172
    invoke-static {p0, p1, p2}, Ll/ܺ᩶;->ܰ(Landroid/app/AppOpsManager;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۙ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)I
    .locals 2

    .line 193
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 194
    invoke-static {p0}, Ll/᩶᩶;->ܰ(Landroid/content/Context;)Landroid/app/AppOpsManager;

    move-result-object v0

    .line 196
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    .line 197
    invoke-static {v0, p1, v1, p2}, Ll/᩶᩶;->ۙ(Landroid/app/AppOpsManager;Ljava/lang/String;ILjava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_0

    return p2

    .line 204
    :cond_0
    invoke-static {p0}, Ll/᩶᩶;->ۙ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 205
    invoke-static {v0, p1, p3, p0}, Ll/᩶᩶;->ۙ(Landroid/app/AppOpsManager;Ljava/lang/String;ILjava/lang/String;)I

    move-result p0

    return p0

    .line 208
    :cond_1
    invoke-static {p0, p1, p2}, Ll/֡᩶;->ۙ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 78
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 79
    invoke-static {p0}, Ll/ܺ᩶;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۡۖᩳ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Ljava/util/IdentityHashMap;

    invoke-virtual {p0, p1, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۡ᩹֫(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    check-cast p0, Ljava/lang/Throwable;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static ۢۖ۟([SIII)Ljava/lang/String;
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

.method public static ۢܳ᩺()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static ܳۛ᩺(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0}, Ll/ܰ֡۠;->ۙ(Ljava/lang/Object;)V

    return-void
.end method

.method public static ܶ᩺۫(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Landroid/widget/CompoundButton;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    return p0
.end method

.method public static ᩳۢۚ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ᩳ۬ܺ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Throwable;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ᩴۖۙ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    return p0
.end method

.method public static ᩴ۠֫(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p0

    return p0
.end method

.method public static ᩷᩷ܽ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static ᩷᩺ۗ(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p0, Landroid/widget/CompoundButton;

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

.method public static ᩸ۛ۫(Ljava/lang/Object;Ljava/lang/Object;)Ll/۫֫᩺;
    .locals 0

    check-cast p0, Ll/ۖۢ᩺;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۖۢ᩺;->getEntry(Ljava/lang/String;)Ll/۫֫᩺;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻ۗ۠(Ljava/lang/Object;)Ll/ۚ֫ᩴ;
    .locals 0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Ll/ۡܿᩴ;->stream(Ljava/util/Collection;)Ll/ۚ֫ᩴ;

    move-result-object p0

    return-object p0
.end method
