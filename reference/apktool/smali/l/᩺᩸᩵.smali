.class public final Ll/᩺᩸᩵;
.super Ljava/lang/Object;
.source "W6G0"


# static fields
.field public static final ۙ:Ll/֡ۡۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 78
    new-instance v0, Ll/֡ۡۗ;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v0, v1}, Ll/֡ۡۗ;-><init>(Ljava/util/List;)V

    sput-object v0, Ll/᩺᩸᩵;->ۙ:Ll/֡ۡۗ;

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ۘ᩸᩵;)V
    .locals 4

    .line 45
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    const/4 v1, 0x0

    .line 47
    :goto_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v2

    invoke-static {p0, p1, v2}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ۘ᩸᩵;Ll/ܿۡۗ;)Z

    move-result v2

    add-int/lit8 v3, v1, 0x1

    if-gt v1, v0, :cond_1

    if-nez v2, :cond_0

    return-void

    :cond_0
    move v1, v3

    goto :goto_0

    .line 49
    :cond_1
    new-instance v1, Ll/۠ۧ᩵;

    const-string v2, "Iterative traversal limit reached: limit: "

    const-string v3, ", visitor: "

    .line 0
    invoke-static {v0, v2, v3}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", blocks count: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 51
    throw v1
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ll/ۛ᩸ۨ;)V
    .locals 0

    .line 31
    invoke-static {p0, p2, p1}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;Ll/ۛۡۗ;)V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ۧ᩷ܳ;)V
    .locals 5

    .line 59
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    const/4 v1, 0x0

    .line 61
    :goto_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v2

    invoke-static {p0, p1, v2}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ۘ᩸᩵;Ll/ܿۡۗ;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 63
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ۠ۗ;

    .line 64
    invoke-virtual {v2}, Ll/ᩴ۠ۗ;->ۚ()Ll/ܿۡۗ;

    move-result-object v2

    invoke-static {p0, p1, v2}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ۘ᩸᩵;Ll/ܿۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    add-int/lit8 v3, v1, 0x1

    if-gt v1, v0, :cond_3

    if-nez v2, :cond_2

    return-void

    :cond_2
    move v1, v3

    goto :goto_0

    .line 71
    :cond_3
    new-instance p1, Ll/۠ۧ᩵;

    const-string v1, "Iterative traversal limit reached: limit: "

    const-string v2, ", visitor: "

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 72
    const-class v1, Ll/ۧ᩷ܳ;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", blocks count: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 73
    throw p1
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v0

    invoke-static {p0, p1, v0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;Ll/ۛۡۗ;)V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;Ll/ۛۡۗ;)V
    .locals 4

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 83
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    :cond_0
    :goto_0
    invoke-static {v0}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۛۡۗ;

    if-nez p2, :cond_1

    return-void

    .line 89
    :cond_1
    sget-object v2, Ll/᩺᩸᩵;->ۙ:Ll/֡ۡۗ;

    if-ne p2, v2, :cond_2

    .line 90
    invoke-static {v1}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܿۡۗ;

    .line 91
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p0, p2}, Ll/ܰ᩸᩵;->᩷(Ll/ۖۡۗ;Ll/ܿۡۗ;)V

    goto :goto_0

    .line 92
    :cond_2
    instance-of v3, p2, Ll/᩹ۡۗ;

    if-eqz v3, :cond_3

    .line 93
    check-cast p2, Ll/᩹ۡۗ;

    invoke-interface {p1, p0, p2}, Ll/ܰ᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;)V

    goto :goto_0

    .line 94
    :cond_3
    instance-of v3, p2, Ll/ܿۡۗ;

    if-eqz v3, :cond_0

    .line 95
    check-cast p2, Ll/ܿۡۗ;

    .line 96
    invoke-interface {p1, p0, p2}, Ll/ܰ᩸᩵;->ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z

    move-result v3

    .line 97
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v3, :cond_0

    .line 125
    invoke-interface {p2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p2

    .line 127
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    :goto_1
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_0

    .line 128
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۡۗ;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ۘ᩸᩵;Ll/ܿۡۗ;)Z
    .locals 4

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 134
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    :cond_0
    invoke-static {v0}, Ll/ۜ֫᩵;->᩷(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܿۡۗ;

    if-nez p2, :cond_1

    const/4 p0, 0x0

    return p0

    .line 140
    :cond_1
    invoke-interface {p1, p0, p2}, Ll/ۘ᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    return v2

    .line 143
    :cond_2
    invoke-interface {p2}, Ll/ܿۡۗ;->ܿ()Ljava/util/List;

    move-result-object p2

    .line 145
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_0

    .line 146
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛۡۗ;

    .line 147
    instance-of v3, v2, Ll/ܿۡۗ;

    if-eqz v3, :cond_3

    .line 148
    check-cast v2, Ll/ܿۡۗ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, -0x1

    goto :goto_0
.end method
