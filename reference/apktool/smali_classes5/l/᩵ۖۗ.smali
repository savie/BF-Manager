.class public abstract Ll/᩵ۖۗ;
.super Ll/ܺ۟ۗ;
.source "KIS2"

# interfaces
.implements Ll/ܿۡۗ;


# static fields
.field public static final ֡:Ll/᩻ܽ᩺;


# instance fields
.field public ܿ:Ll/ܿۡۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 11
    const-class v0, Ll/᩵ۖۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/᩵ۖۗ;->֡:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ܿۡۗ;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 16
    iput-object p1, p0, Ll/᩵ۖۗ;->ܿ:Ll/ܿۡۗ;

    return-void
.end method

.method public static ۙ(Ll/ۛۡۗ;Ll/᩵ۖۗ;)V
    .locals 1

    .line 36
    instance-of v0, p0, Ll/ܿۡۗ;

    if-eqz v0, :cond_0

    .line 37
    check-cast p0, Ll/ܿۡۗ;

    invoke-interface {p0, p1}, Ll/ܿۡۗ;->ۙ(Ll/᩵ۖۗ;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getParent()Ll/ܿۡۗ;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/᩵ۖۗ;->ܿ:Ll/ܿۡۗ;

    return-object v0
.end method

.method public ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 1

    .line 19
    new-instance p1, Ll/۟ۧ᩵;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Code generate not implemented for container: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 12
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 19
    throw p1
.end method

.method public final ۙ(Ll/᩵ۖۗ;)V
    .locals 0

    .line 26
    iput-object p1, p0, Ll/᩵ۖۗ;->ܿ:Ll/ܿۡۗ;

    return-void
.end method

.method public ۙ(Ll/ۛۡۗ;Ll/ۛۡۗ;)Z
    .locals 1

    const-string p1, "Replace sub block not supported for class \"{}\""

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    sget-object v0, Ll/᩵ۖۗ;->֡:Ll/᩻ܽ᩺;

    invoke-interface {v0, p2, p1}, Ll/᩻ܽ᩺;->᩸(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public ۧ()Ljava/util/List;
    .locals 1

    .line 80
    invoke-interface {p0}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
