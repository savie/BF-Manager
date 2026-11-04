.class public final Ll/ۖᩴ᩵;
.super Ljava/lang/Object;
.source "56CK"


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public ۤ:I

.field public ۫:Ljava/util/ArrayList;

.field public final ܳ:I

.field public final ᩴ:Ll/ᩳۡۗ;

.field public final ᩷:Ljava/util/ArrayList;

.field public ᩸:Ll/ۖᩴ᩵;


# direct methods
.method public constructor <init>(Ll/ᩳۡۗ;Ljava/util/ArrayList;I)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    .line 32
    iput-object p2, p0, Ll/ۖᩴ᩵;->᩷:Ljava/util/ArrayList;

    .line 33
    iput p3, p0, Ll/ۖᩴ᩵;->ܳ:I

    .line 34
    iput p3, p0, Ll/ۖᩴ᩵;->ۤ:I

    .line 35
    invoke-static {p1}, Ll/ۖᩴ᩵;->ۙ(Ll/ᩳۡۗ;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Ll/ۖᩴ᩵;->ۙ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ۙ(Ll/ᩳۡۗ;)Ljava/util/ArrayList;
    .locals 1

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    invoke-static {p0, v0}, Ll/ۖᩴ᩵;->ۙ(Ll/ᩳۡۗ;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method private ۙ(Ljava/util/BitSet;)V
    .locals 2

    .line 78
    iget-object v0, p0, Ll/ۖᩴ᩵;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨ۗ;

    .line 79
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    .line 81
    :cond_0
    iget-object v0, p0, Ll/ۖᩴ᩵;->۫:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖᩴ᩵;

    .line 84
    invoke-direct {v1, p1}, Ll/ۖᩴ᩵;->ۙ(Ljava/util/BitSet;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/ᩳۡۗ;Ljava/util/ArrayList;)V
    .locals 3

    .line 45
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->۬ۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_0

    .line 46
    move-object v0, p0

    check-cast v0, Ll/ۙۡۗ;

    invoke-virtual {v0}, Ll/ۙۡۗ;->᩵ۙ()Ll/ۢۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢۖۗ;->ۤۙ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 48
    :cond_0
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ۛ֨ۗ;

    if-eqz v2, :cond_1

    .line 50
    check-cast v1, Ll/ۛ֨ۗ;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v0, Ll/ܽ֨ۗ;

    if-eqz v1, :cond_3

    .line 55
    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۖᩴ᩵;->ۙ(Ll/ᩳۡۗ;Ljava/util/ArrayList;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Z
    .locals 2

    .line 101
    invoke-static {p1}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 104
    :cond_0
    iget-object v0, p0, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    invoke-static {p1, v0, p2}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 107
    :cond_1
    iget-object v0, p0, Ll/ۖᩴ᩵;->۫:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    .line 108
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖᩴ᩵;

    .line 109
    invoke-direct {v1, p1, p2}, Ll/ۖᩴ᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Z

    move-result v1

    if-nez v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public static ۙ(Ll/ᩳۡۗ;Ljava/util/BitSet;)Z
    .locals 2

    .line 167
    invoke-virtual {p1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 170
    :cond_0
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p0

    if-nez p0, :cond_1

    return v1

    .line 174
    :cond_1
    invoke-virtual {p0}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/util/BitSet;->get(I)Z

    move-result p0

    return p0
.end method

.method private ᩸()Z
    .locals 2

    .line 152
    iget-object v0, p0, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->᩷ۙ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 155
    :cond_0
    iget-object v0, p0, Ll/ۖᩴ᩵;->۫:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 157
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖᩴ᩵;

    .line 158
    invoke-direct {v1}, Ll/ۖᩴ᩵;->᩸()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ArgsInfo: |"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۖᩴ᩵;->ۤ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    iget-object v1, p0, Ll/ۖᩴ᩵;->᩸:Ll/ۖᩴ᩵;

    if-nez v1, :cond_0

    const-string v1, "-"

    goto :goto_0

    :cond_0
    iget v1, v1, Ll/ۖᩴ᩵;->ܳ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖᩴ᩵;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ۖᩴ᩵;->ۙ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;ILl/ۛ֨ۗ;)Ll/۬ᩴ᩵;
    .locals 6

    .line 90
    iget v0, p0, Ll/ۖᩴ᩵;->ۤ:I

    if-ge p2, v0, :cond_9

    .line 91
    iget-object v0, p0, Ll/ۖᩴ᩵;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖᩴ᩵;

    iget-object v2, p0, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    invoke-direct {v1, p1, v2}, Ll/ۖᩴ᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget p1, p0, Ll/ۖᩴ᩵;->ۤ:I

    .line 118
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖᩴ᩵;

    add-int/lit8 v2, p2, 0x1

    if-ne v2, p1, :cond_0

    goto :goto_3

    :cond_0
    if-gt v2, p1, :cond_8

    .line 69
    iget-object v3, v1, Ll/ۖᩴ᩵;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, v1, Ll/ۖᩴ᩵;->۫:Ljava/util/ArrayList;

    invoke-static {v3}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 70
    sget-object v3, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    goto :goto_0

    .line 72
    :cond_1
    new-instance v3, Ljava/util/BitSet;

    invoke-direct {v3}, Ljava/util/BitSet;-><init>()V

    .line 73
    invoke-direct {v1, v3}, Ll/ۖᩴ᩵;->ۙ(Ljava/util/BitSet;)V

    .line 128
    :goto_0
    sget-object v4, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    if-ne v3, v4, :cond_2

    iget-object v4, v1, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    invoke-virtual {v4}, Ll/ᩳۡۗ;->ܶۙ()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_3

    .line 131
    :cond_2
    invoke-direct {v1}, Ll/ۖᩴ᩵;->᩸()Z

    move-result v1

    :goto_1
    if-ge v2, p1, :cond_6

    .line 133
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖᩴ᩵;

    .line 134
    invoke-virtual {v4}, Ll/ۖᩴ᩵;->᩷()Ll/ۖᩴ᩵;

    move-result-object v5

    if-ne v5, p0, :cond_3

    goto :goto_2

    .line 137
    :cond_3
    iget-object v4, v4, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    if-eqz v1, :cond_4

    .line 139
    invoke-static {v4, v3}, Ll/ۖᩴ᩵;->ۙ(Ll/ᩳۡۗ;Ljava/util/BitSet;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    .line 143
    :cond_4
    invoke-virtual {v4}, Ll/ᩳۡۗ;->᩷ۙ()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-static {v4, v3}, Ll/ۖᩴ᩵;->ۙ(Ll/ᩳۡۗ;Ljava/util/BitSet;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 95
    :cond_6
    :goto_3
    iput p2, p0, Ll/ۖᩴ᩵;->ۤ:I

    .line 178
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۖᩴ᩵;

    .line 179
    iput-object p0, p1, Ll/ۖᩴ᩵;->᩸:Ll/ۖᩴ᩵;

    .line 180
    iget-object p2, p0, Ll/ۖᩴ᩵;->۫:Ljava/util/ArrayList;

    if-nez p2, :cond_7

    .line 181
    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Ll/ۖᩴ᩵;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p2, p0, Ll/ۖᩴ᩵;->۫:Ljava/util/ArrayList;

    .line 183
    :cond_7
    iget-object p2, p0, Ll/ۖᩴ᩵;->۫:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    new-instance p2, Ll/۬ᩴ᩵;

    iget-object p1, p1, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    invoke-direct {p2, p1, p3}, Ll/۬ᩴ᩵;-><init>(Ll/ᩳۡۗ;Ll/ۛ֨ۗ;)V

    return-object p2

    .line 125
    :cond_8
    new-instance p2, Ll/۠ۧ᩵;

    const-string p3, "Invalid inline insn positions: "

    const-string v0, " - "

    .line 0
    invoke-static {p3, v2, p1, v0}, Ll/ۜۚ᩸;->ۙ(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 125
    throw p2

    :cond_9
    :goto_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۤ()Ll/ᩳۡۗ;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۖᩴ᩵;->ᩴ:Ll/ᩳۡۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ۖᩴ᩵;
    .locals 1

    .line 188
    iget-object v0, p0, Ll/ۖᩴ᩵;->᩸:Ll/ۖᩴ᩵;

    if-eqz v0, :cond_0

    .line 189
    invoke-virtual {v0}, Ll/ۖᩴ᩵;->᩷()Ll/ۖᩴ᩵;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 191
    iput-object v0, p0, Ll/ۖᩴ᩵;->᩸:Ll/ۖᩴ᩵;

    .line 194
    :cond_0
    iget-object v0, p0, Ll/ۖᩴ᩵;->᩸:Ll/ۖᩴ᩵;

    return-object v0
.end method
