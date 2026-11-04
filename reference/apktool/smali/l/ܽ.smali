.class public Ll/ܽ;
.super Ljava/lang/Object;
.source "95XT"


# static fields
.field public static ᩷۬ۗ:Z


# instance fields
.field public final ۙ:Landroid/media/browse/MediaBrowser$ConnectionCallback;

.field public ᩷:Ll/ۗ;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>()V
    .locals 1

    .line 646
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 648
    new-instance v0, Ll/ܺ;

    invoke-direct {v0, p0}, Ll/ܺ;-><init>(Ll/ܽ;)V

    iput-object v0, p0, Ll/ܽ;->ۙ:Landroid/media/browse/MediaBrowser$ConnectionCallback;

    return-void
.end method

.method public static ֨᩵ۛ(ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۛ۟ۤ(Ljava/lang/Object;)Ll/᩵ܺۗ;
    .locals 0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۜ᩹ᩳ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/util/concurrent/Executor;

    check-cast p1, Ljava/lang/Runnable;

    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ۜ᩻֨(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static ۠ۧ۫(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۢ֡᩵(I)V
    .locals 0

    invoke-static {p0}, Ll/᩸۠ۧ;->᩷(I)V

    return-void
.end method

.method public static ۤۖۡ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static ۤ᩷᩸(Ljava/lang/Object;)Ll/᩸۠ۧ;
    .locals 0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(Ljava/lang/CharSequence;)Ll/᩸۠ۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ܳ᩻۬(Ljava/lang/Object;I)Z
    .locals 0

    check-cast p0, Ll/ۗۧܺ;

    invoke-virtual {p0, p1}, Ll/ۗۧܺ;->ۙ(I)Z

    move-result p0

    return p0
.end method

.method public static ᩴ᩸᩸(Ljava/lang/Object;Ljava/lang/Object;Z)Ll/ᩳ֫ܺ;
    .locals 0

    check-cast p0, Ll/ᩳ֫ܺ;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1, p2}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷ۚۖ(Ljava/lang/Object;CLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Ll/᩸᩹᩹;

    invoke-interface {p0, p1, p2}, Ll/᩸᩹᩹;->ۙ(CLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷ܰۨ([SIII)Ljava/lang/String;
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

.method public static ᩹۟᩸(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/᩷ۨᩴ;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ᩳ()Z

    move-result p0

    return p0
.end method

.method public static ᩹ᩳܶ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static ᩹᩸ۡ(Ljava/lang/Object;)Ll/ۨ᩷ܳ;
    .locals 0

    check-cast p0, Ll/ܿۙܳ;

    invoke-virtual {p0}, Ll/ܿۙܳ;->ᩴ()Ll/ۨ᩷ܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩺ܰۖ(Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    check-cast p0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method


# virtual methods
.method public ۙ()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public ۤ()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public ᩷()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
