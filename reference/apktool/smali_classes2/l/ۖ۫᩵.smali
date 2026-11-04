.class public final Ll/ۖ۫᩵;
.super Ljava/lang/Object;
.source "Z6BN"


# static fields
.field public static final ۤ:Ll/ۖ۫᩵;

.field public static final ᩴ:Ll/ۖ۫᩵;

.field public static final ᩷:Ll/ۖ۫᩵;

.field public static final ᩸:Ll/ۖ۫᩵;


# instance fields
.field public final ۙ:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x0

    new-array v1, v0, [Ll/ۡ۫᩵;

    .line 20
    invoke-static {v1}, Ll/ۖ۫᩵;->ۙ([Ll/ۡ۫᩵;)Ll/ۖ۫᩵;

    move-result-object v1

    sput-object v1, Ll/ۖ۫᩵;->ۤ:Ll/ۖ۫᩵;

    .line 21
    sget-object v1, Ll/ۡ۫᩵;->᩶:Ll/ۡ۫᩵;

    const/4 v2, 0x1

    new-array v3, v2, [Ll/ۡ۫᩵;

    aput-object v1, v3, v0

    invoke-static {v3}, Ll/ۖ۫᩵;->ۙ([Ll/ۡ۫᩵;)Ll/ۖ۫᩵;

    move-result-object v3

    sput-object v3, Ll/ۖ۫᩵;->᩸:Ll/ۖ۫᩵;

    const/4 v3, 0x2

    new-array v4, v3, [Ll/ۡ۫᩵;

    aput-object v1, v4, v0

    .line 22
    sget-object v5, Ll/ۡ۫᩵;->ܿ:Ll/ۡ۫᩵;

    aput-object v5, v4, v2

    invoke-static {v4}, Ll/ۖ۫᩵;->ۙ([Ll/ۡ۫᩵;)Ll/ۖ۫᩵;

    move-result-object v4

    sput-object v4, Ll/ۖ۫᩵;->ᩴ:Ll/ۖ۫᩵;

    const/4 v4, 0x3

    new-array v4, v4, [Ll/ۡ۫᩵;

    aput-object v1, v4, v0

    .line 23
    sget-object v0, Ll/ۡ۫᩵;->۟:Ll/ۡ۫᩵;

    aput-object v0, v4, v2

    sget-object v0, Ll/ۡ۫᩵;->֡:Ll/ۡ۫᩵;

    aput-object v0, v4, v3

    invoke-static {v4}, Ll/ۖ۫᩵;->ۙ([Ll/ۡ۫᩵;)Ll/ۖ۫᩵;

    move-result-object v0

    sput-object v0, Ll/ۖ۫᩵;->᩷:Ll/ۖ۫᩵;

    return-void
.end method

.method public constructor <init>(Ljava/util/EnumSet;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ۖ۫᩵;->ۙ:Ljava/util/Set;

    return-void
.end method

.method public static varargs ۙ([Ll/ۡ۫᩵;)Ll/ۖ۫᩵;
    .locals 4

    .line 29
    array-length v0, p0

    if-nez v0, :cond_0

    .line 30
    const-class p0, Ll/ۡ۫᩵;

    invoke-static {p0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p0

    goto :goto_1

    .line 0
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    .line 32
    invoke-static {p0}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p0

    .line 34
    :goto_1
    new-instance v0, Ll/ۖ۫᩵;

    invoke-direct {v0, p0}, Ll/ۖ۫᩵;-><init>(Ljava/util/EnumSet;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۖ۫᩵;->ۙ:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Z
    .locals 2

    .line 42
    iget-object v0, p0, Ll/ۖ۫᩵;->ۙ:Ljava/util/Set;

    sget-object v1, Ll/ۡ۫᩵;->᩶:Ll/ۡ۫᩵;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ۤ()Z
    .locals 2

    .line 50
    iget-object v0, p0, Ll/ۖ۫᩵;->ۙ:Ljava/util/Set;

    sget-object v1, Ll/ۡ۫᩵;->֡:Ll/ۡ۫᩵;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ᩷()Z
    .locals 2

    .line 46
    iget-object v0, p0, Ll/ۖ۫᩵;->ۙ:Ljava/util/Set;

    sget-object v1, Ll/ۡ۫᩵;->ܿ:Ll/ۡ۫᩵;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final ᩸()Z
    .locals 2

    .line 54
    iget-object v0, p0, Ll/ۖ۫᩵;->ۙ:Ljava/util/Set;

    sget-object v1, Ll/ۡ۫᩵;->۟:Ll/ۡ۫᩵;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
