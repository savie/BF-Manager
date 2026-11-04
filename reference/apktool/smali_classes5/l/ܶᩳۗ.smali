.class public final Ll/ܶᩳۗ;
.super Ll/ܺ᩶ۗ;
.source "M6HP"


# instance fields
.field public final ܰ:Ljava/util/Set;

.field public ܿ:Ljava/util/SortedSet;

.field public final ᩶:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/SortedSet;Ljava/util/Set;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ܶᩳۗ;->᩶:Ljava/util/List;

    .line 28
    iput-object p2, p0, Ll/ܶᩳۗ;->ܿ:Ljava/util/SortedSet;

    .line 29
    iput-object p3, p0, Ll/ܶᩳۗ;->ܰ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "METHOD_OVERRIDE: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    iget-object v1, p0, Ll/ܶᩳۗ;->ܰ:Ljava/util/Set;

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 12
    sget-object v0, Ll/ۧ۟ۗ;->ᩳ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/Set;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ܶᩳۗ;->ܰ:Ljava/util/Set;

    return-object v0
.end method

.method public final ۙ(Ljava/util/SortedSet;)V
    .locals 0

    .line 45
    iput-object p1, p0, Ll/ܶᩳۗ;->ܿ:Ljava/util/SortedSet;

    return-void
.end method

.method public final ܳ()Ljava/util/SortedSet;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ܶᩳۗ;->ܿ:Ljava/util/SortedSet;

    return-object v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/ܶᩳۗ;->᩶:Ljava/util/List;

    return-object v0
.end method
