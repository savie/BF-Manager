.class public final Ll/ۨᩴ᩵;
.super Ljava/lang/Object;
.source "96FJ"


# instance fields
.field public ۙ:Ll/᩵ᩴ᩵;

.field public final ᩷:Ljava/util/ArrayDeque;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 19
    const-class v0, Ll/ۨᩴ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۨᩴ᩵;->᩷:Ljava/util/ArrayDeque;

    .line 61
    new-instance v0, Ll/᩵ᩴ᩵;

    invoke-direct {v0}, Ll/᩵ᩴ᩵;-><init>()V

    iput-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Region stack size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    iget-object v1, p0, Ll/ۨᩴ᩵;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v1

    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", last: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()V
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ۨᩴ᩵;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 123
    new-instance v0, Ll/᩵ᩴ᩵;

    invoke-direct {v0}, Ll/᩵ᩴ᩵;-><init>()V

    iput-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    return-void
.end method

.method public final ۙ(Ll/᩵ۖۗ;)V
    .locals 2

    .line 65
    iget-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    iget-object v1, p0, Ll/ۨᩴ᩵;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    move-result v0

    const/16 v1, 0x3e8

    if-gt v0, v1, :cond_0

    .line 69
    iget-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    invoke-virtual {v0, p1}, Ll/᩵ᩴ᩵;->ۙ(Ll/᩵ۖۗ;)Ll/᩵ᩴ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    return-void

    .line 67
    :cond_0
    new-instance p1, Ll/ۖۧ᩵;

    const-string v0, "Regions stack size limit reached"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 67
    throw p1
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 89
    iget-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    iget-object v0, v0, Ll/᩵ᩴ᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ۤ()Ll/ܿۡۗ;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    iget-object v0, v0, Ll/᩵ᩴ᩵;->᩷:Ll/᩵ۖۗ;

    return-object v0
.end method

.method public final ۤ(Ll/᩷ۡۗ;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 101
    iget-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    iget-object v0, v0, Ll/᩵ᩴ᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ᩷()Ljava/util/Set;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    iget-object v0, v0, Ll/᩵ᩴ᩵;->ۙ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ᩷(Ll/᩷ۡۗ;)Z
    .locals 1

    .line 106
    iget-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    iget-object v0, v0, Ll/᩵ᩴ᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ᩸()V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/ۨᩴ᩵;->᩷:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ᩴ᩵;

    iput-object v0, p0, Ll/ۨᩴ᩵;->ۙ:Ll/᩵ᩴ᩵;

    return-void
.end method
