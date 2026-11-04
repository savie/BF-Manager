.class public final Ll/ۜ֡ۗ;
.super Ljava/lang/Object;
.source "J6CM"


# static fields
.field public static final ۤ:Ljava/util/regex/Pattern;


# instance fields
.field public final ۙ:Z

.field public final ᩷:Ljava/util/HashSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, ".*(\\d+)$"

    .line 91
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۜ֡ۗ;->ۤ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ll/ۨ֡ۗ;Ll/ۖۡۗ;)V
    .locals 3

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۜ֡ۗ;->᩷:Ljava/util/HashSet;

    .line 25
    invoke-virtual {p1}, Ll/ۨ֡ۗ;->۫()Z

    move-result v1

    iput-boolean v1, p0, Ll/ۜ֡ۗ;->ۙ:Z

    .line 27
    invoke-virtual {p2}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "this"

    .line 28
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "super"

    .line 29
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 31
    :cond_0
    invoke-virtual {p1}, Ll/ۨ֡ۗ;->᩸()Ll/ۜ֡ۗ;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 39
    iget-object p1, p1, Ll/ۜ֡ۗ;->᩷:Ljava/util/HashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 43
    :cond_1
    invoke-virtual {p2}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۡۗ;

    .line 45
    invoke-virtual {v1}, Ll/ܽۡۗ;->۫ۙ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 46
    invoke-virtual {v1}, Ll/ܽۡۗ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 49
    :cond_3
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩻ۡۗ;

    .line 50
    invoke-virtual {p2}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object p2

    invoke-virtual {p2}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-void
.end method

.method private ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 94
    iget-object v0, p0, Ll/ۜ֡ۗ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 95
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object p1

    .line 102
    :cond_0
    sget-object v1, Ll/ۜ֡ۗ;->ۤ:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 103
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 104
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->start(I)I

    move-result v4

    invoke-virtual {p1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 105
    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    .line 0
    :goto_0
    invoke-static {p1}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    .line 111
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 113
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object v1

    :cond_2
    move v1, v3

    goto :goto_0
.end method


# virtual methods
.method public final ۙ(Ll/ۛ֨ۗ;)Ljava/lang/String;
    .locals 2

    .line 77
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 78
    iget-boolean v1, p0, Ll/ۜ֡ۗ;->ۙ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    .line 137
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "r"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۧ֨ۗ;)Ljava/lang/String;
    .locals 5

    .line 55
    iget-boolean v0, p0, Ll/ۜ֡ۗ;->ۙ:Z

    const-string v1, "r"

    const/4 v2, 0x0

    const-string v3, "v"

    if-eqz v0, :cond_1

    .line 129
    invoke-virtual {p1}, Ll/ۧ֨ۗ;->᩸()Ljava/util/List;

    move-result-object p1

    .line 130
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object v3

    .line 133
    :cond_0
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿ֨ۗ;

    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object p1

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 58
    :cond_1
    invoke-virtual {p1}, Ll/ۧ֨ۗ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "this"

    return-object p1

    .line 120
    :cond_2
    invoke-virtual {p1}, Ll/ۧ֨ۗ;->ۤ()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 122
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 129
    :cond_3
    invoke-virtual {p1}, Ll/ۧ֨ۗ;->᩸()Ljava/util/List;

    move-result-object v0

    .line 130
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    .line 133
    :cond_4
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ֨ۗ;

    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    move-object v0, v3

    .line 61
    :goto_1
    invoke-direct {p0, v0}, Ll/ۜ֡ۗ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-virtual {p1, v0}, Ll/ۧ֨ۗ;->ۙ(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۙ(Ll/᩵֨ۗ;)Ljava/lang/String;
    .locals 2

    .line 67
    invoke-virtual {p1}, Ll/᩵֨ۗ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 68
    iget-boolean v1, p0, Ll/ۜ֡ۗ;->ۙ:Z

    if-eqz v1, :cond_0

    return-object v0

    .line 71
    :cond_0
    invoke-direct {p0, v0}, Ll/ۜ֡ۗ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-virtual {p1, v0}, Ll/᩵֨ۗ;->setName(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۙ(Ll/᩻ᩳۗ;)Ljava/lang/String;
    .locals 2

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loop"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩻ᩳۗ;->ۙ()Ll/ۧᩳۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧᩳۗ;->᩸()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 87
    iget-object v0, p0, Ll/ۜ֡ۗ;->᩷:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final ۙ(Ll/ۜ֡ۗ;)V
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۜ֡ۗ;->᩷:Ljava/util/HashSet;

    iget-object p1, p1, Ll/ۜ֡ۗ;->᩷:Ljava/util/HashSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
