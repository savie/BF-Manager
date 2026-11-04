.class public final Ll/ۘۢۚ;
.super Ljava/lang/Object;
.source "Y6JG"


# instance fields
.field public ۙ:Z

.field public final ۤ:Ljava/util/function/Predicate;

.field public ᩷:[B


# direct methods
.method public constructor <init>(Ljava/util/function/Predicate;)V
    .locals 0

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 192
    iput-object p1, p0, Ll/ۘۢۚ;->ۤ:Ljava/util/function/Predicate;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۘۢۚ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۘۢۚ;->ۙ:Z

    return p0
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;I[B)V
    .locals 2

    .line 196
    iget-boolean v0, p0, Ll/ۘۢۚ;->ۙ:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۘۢۚ;->᩷:[B

    const/4 v1, 0x3

    if-eqz v0, :cond_0

    if-ne p2, v1, :cond_3

    :cond_0
    const-string v0, "-->"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    array-length p1, p3

    if-eqz p1, :cond_3

    array-length p1, p3

    const/high16 v0, 0x800000

    if-le p1, v0, :cond_1

    goto :goto_1

    .line 198
    :cond_1
    iget-object p1, p0, Ll/ۘۢۚ;->ۤ:Ljava/util/function/Predicate;

    invoke-interface {p1, p3}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 199
    iput-object p3, p0, Ll/ۘۢۚ;->᩷:[B

    if-ne p2, v1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 200
    :goto_0
    iput-boolean p1, p0, Ll/ۘۢۚ;->ۙ:Z

    :cond_3
    :goto_1
    return-void
.end method
