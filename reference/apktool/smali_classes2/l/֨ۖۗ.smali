.class public final Ll/֨ۖۗ;
.super Ljava/lang/Object;
.source "FIWH"


# instance fields
.field public final ۙ:Ll/ۢۖۗ;

.field public final ۚ:Ll/᩷ۡۗ;

.field public final ۤ:Ljava/util/List;

.field public final ۫:Ljava/util/Set;

.field public ܳ:Ll/᩷ۡۗ;

.field public final ᩴ:Ll/ۖۡۗ;

.field public final ᩷:Ll/᩷ۡۗ;

.field public final ᩸:Ll/ܿۧ᩵;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;Ll/ۢۖۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 8

    .line 27
    new-instance v5, Ll/ܿۧ᩵;

    invoke-direct {v5, p1}, Ll/ܿۧ᩵;-><init>(Ll/ۖۡۗ;)V

    .line 26
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v7}, Ll/֨ۖۗ;-><init>(Ll/ۖۡۗ;Ll/ۢۖۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/ܿۧ᩵;Ljava/util/Set;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ll/ۖۡۗ;Ll/ۢۖۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/ܿۧ᩵;Ljava/util/Set;Ljava/util/List;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/֨ۖۗ;->ᩴ:Ll/ۖۡۗ;

    .line 37
    iput-object p2, p0, Ll/֨ۖۗ;->ۙ:Ll/ۢۖۗ;

    .line 38
    iput-object p3, p0, Ll/֨ۖۗ;->ۚ:Ll/᩷ۡۗ;

    .line 39
    iput-object p4, p0, Ll/֨ۖۗ;->᩷:Ll/᩷ۡۗ;

    .line 40
    iput-object p5, p0, Ll/֨ۖۗ;->᩸:Ll/ܿۧ᩵;

    .line 41
    iput-object p6, p0, Ll/֨ۖۗ;->۫:Ljava/util/Set;

    .line 42
    iput-object p7, p0, Ll/֨ۖۗ;->ۤ:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ll/᩷ۡۗ;Ll/֨ۖۗ;)V
    .locals 8

    .line 70
    iget-object v1, p2, Ll/֨ۖۗ;->ᩴ:Ll/ۖۡۗ;

    .line 74
    iget-object v2, p2, Ll/֨ۖۗ;->ۙ:Ll/ۢۖۗ;

    .line 66
    iget-object v5, p2, Ll/֨ۖۗ;->᩸:Ll/ܿۧ᩵;

    .line 78
    iget-object v6, p2, Ll/֨ۖۗ;->۫:Ljava/util/Set;

    .line 98
    iget-object v7, p2, Ll/֨ۖۗ;->ۤ:Ljava/util/List;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v3, p1

    .line 30
    invoke-direct/range {v0 .. v7}, Ll/֨ۖۗ;-><init>(Ll/ۖۡۗ;Ll/ۢۖۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/ܿۧ᩵;Ljava/util/Set;Ljava/util/List;)V

    return-void
.end method

.method public static ۙ(Ll/֨ۖۗ;)Ll/֨ۖۗ;
    .locals 9

    .line 46
    new-instance v8, Ll/֨ۖۗ;

    .line 70
    iget-object v1, p0, Ll/֨ۖۗ;->ᩴ:Ll/ۖۡۗ;

    .line 74
    iget-object v0, p0, Ll/֨ۖۗ;->ۙ:Ll/ۢۖۗ;

    .line 47
    invoke-static {v0}, Ll/ۢۖۗ;->ۙ(Ll/ۢۖۗ;)Ll/ۢۖۗ;

    move-result-object v2

    .line 86
    iget-object v3, p0, Ll/֨ۖۗ;->᩷:Ll/᩷ۡۗ;

    .line 82
    iget-object v4, p0, Ll/֨ۖۗ;->ۚ:Ll/᩷ۡۗ;

    .line 66
    iget-object v5, p0, Ll/֨ۖۗ;->᩸:Ll/ܿۧ᩵;

    .line 78
    iget-object v6, p0, Ll/֨ۖۗ;->۫:Ljava/util/Set;

    .line 98
    iget-object v7, p0, Ll/֨ۖۗ;->ۤ:Ljava/util/List;

    move-object v0, v8

    .line 49
    invoke-direct/range {v0 .. v7}, Ll/֨ۖۗ;-><init>(Ll/ۖۡۗ;Ll/ۢۖۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/ܿۧ᩵;Ljava/util/Set;Ljava/util/List;)V

    return-object v8
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IfInfo: then: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֨ۖۗ;->ۚ:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", else: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֨ۖۗ;->᩷:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/᩷ۡۗ;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/֨ۖۗ;->ۚ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۙ()Ll/ۢۖۗ;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/֨ۖۗ;->ۙ:Ll/ۢۖۗ;

    return-object v0
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 1

    .line 106
    iget-object v0, p0, Ll/֨ۖۗ;->ۤ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 0

    .line 94
    iput-object p1, p0, Ll/֨ۖۗ;->ܳ:Ll/᩷ۡۗ;

    return-void
.end method

.method public final varargs ۙ([Ll/֨ۖۗ;)V
    .locals 5

    .line 53
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 54
    iget-object v3, p0, Ll/֨ۖۗ;->᩸:Ll/ܿۧ᩵;

    .line 66
    iget-object v4, v2, Ll/֨ۖۗ;->᩸:Ll/ܿۧ᩵;

    .line 54
    invoke-virtual {v3, v4}, Ll/ܿۧ᩵;->ۙ(Ll/ܿۧ᩵;)V

    .line 55
    iget-object v3, p0, Ll/֨ۖۗ;->۫:Ljava/util/Set;

    .line 78
    iget-object v4, v2, Ll/֨ۖۗ;->۫:Ljava/util/Set;

    .line 55
    invoke-interface {v3, v4}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 98
    iget-object v2, v2, Ll/֨ۖۗ;->ۤ:Ljava/util/List;

    .line 56
    invoke-virtual {p0, v2}, Ll/֨ۖۗ;->ۙ(Ljava/util/List;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۚ()Ljava/util/Set;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/֨ۖۗ;->۫:Ljava/util/Set;

    return-object v0
.end method

.method public final ۤ()Ll/᩷ۡۗ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 62
    iget-object v0, p0, Ll/֨ۖۗ;->᩸:Ll/ܿۧ᩵;

    invoke-virtual {v0}, Ll/ܿۧ᩵;->getFirst()Ll/᩷ۡۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()V
    .locals 1

    .line 102
    iget-object v0, p0, Ll/֨ۖۗ;->ۤ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final ۫()Ll/᩷ۡۗ;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/֨ۖۗ;->ܳ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ܳ()Ll/ۖۡۗ;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/֨ۖۗ;->ᩴ:Ll/ۖۡۗ;

    return-object v0
.end method

.method public final ᩴ()Ll/ܿۧ᩵;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/֨ۖۗ;->᩸:Ll/ܿۧ᩵;

    return-object v0
.end method

.method public final ᩷()Ll/᩷ۡۗ;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/֨ۖۗ;->᩷:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ᩸()Ljava/util/List;
    .locals 1

    .line 98
    iget-object v0, p0, Ll/֨ۖۗ;->ۤ:Ljava/util/List;

    return-object v0
.end method
