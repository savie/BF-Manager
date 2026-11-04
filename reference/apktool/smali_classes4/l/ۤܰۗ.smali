.class public final Ll/ۤܰۗ;
.super Ll/ܳܰۗ;
.source "U6BT"


# instance fields
.field public ֫:Ljava/util/Map;

.field public ۚ:I

.field public ۧ:I

.field public ۫:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ll/ۛۘۗ;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Ll/ܳܰۗ;-><init>(Ll/ۛۘۗ;)V

    const/4 p1, 0x1

    .line 18
    iput p1, p0, Ll/ۤܰۗ;->ۚ:I

    .line 20
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/ۤܰۗ;->۫:Ljava/util/Map;

    .line 21
    iput-object p1, p0, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    return-void
.end method

.method private ۙ(Ll/ۧܰۗ;I)V
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ۤܰۗ;->۫:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۤܰۗ;->۫:Ljava/util/Map;

    .line 133
    :cond_0
    iget-object v0, p0, Ll/ۤܰۗ;->۫:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/String;)Ll/ۗۘۗ;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    iget v0, p0, Ll/ۤܰۗ;->ۧ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۤܰۗ;->ۧ:I

    return-object p0
.end method

.method public final add(Ljava/lang/String;)Ll/ܳܰۗ;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    iget v0, p0, Ll/ۤܰۗ;->ۧ:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۤܰۗ;->ۧ:I

    return-object p0
.end method

.method public final ֫()V
    .locals 2

    .line 90
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    iget v0, p0, Ll/ۤܰۗ;->ۧ:I

    iget-object v1, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۤܰۗ;->ۧ:I

    return-void
.end method

.method public final ۙ(C)Ll/ۗۘۗ;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    iget p1, p0, Ll/ۤܰۗ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۤܰۗ;->ۧ:I

    return-object p0
.end method

.method public final bridge synthetic ۙ(Ljava/lang/String;)Ll/ۗۘۗ;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ll/ۤܰۗ;->ۙ(Ljava/lang/String;)V

    return-object p0
.end method

.method public final ۙ(Ll/ۤܰۗ;)Ll/ۗۘۗ;
    .locals 4

    .line 65
    iget v0, p0, Ll/ۤܰۗ;->ۚ:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ۤܰۗ;->ۚ:I

    .line 233
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    .line 67
    iget-object v1, p1, Ll/ۤܰۗ;->۫:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 68
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v0

    .line 70
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧܰۗ;

    invoke-direct {p0, v2, v3}, Ll/ۤܰۗ;->ۙ(Ll/ۧܰۗ;I)V

    goto :goto_0

    .line 72
    :cond_0
    iget-object v0, p1, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 73
    iget v2, p0, Ll/ۤܰۗ;->ۚ:I

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 145
    iget-object v2, p0, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 146
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    iput-object v2, p0, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    .line 148
    :cond_1
    iget-object v2, p0, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 75
    :cond_2
    iget v0, p0, Ll/ۤܰۗ;->ۚ:I

    iget v1, p1, Ll/ۤܰۗ;->ۚ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۤܰۗ;->ۚ:I

    .line 76
    iget v0, p1, Ll/ۤܰۗ;->ۧ:I

    iput v0, p0, Ll/ۤܰۗ;->ۧ:I

    .line 77
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final ۙ(C)Ll/ܳܰۗ;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    iget p1, p0, Ll/ۤܰۗ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۤܰۗ;->ۧ:I

    return-object p0
.end method

.method public final bridge synthetic ۙ(Ljava/lang/String;)Ll/ܳܰۗ;
    .locals 0

    .line 16
    invoke-virtual {p0, p1}, Ll/ۤܰۗ;->ۙ(Ljava/lang/String;)V

    return-object p0
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 7

    .line 34
    iget-object v0, p0, Ll/ܳܰۗ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 35
    iget-object v1, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v0}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 35
    iget-object v3, p0, Ll/ܳܰۗ;->ۤ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    iget v1, p0, Ll/ۤܰۗ;->ۚ:I

    sget v2, Ll/ۨۧ᩵;->᩷:I

    .line 278
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 281
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 284
    :goto_0
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    const/4 v6, -0x1

    if-eq v4, v6, :cond_2

    add-int/lit8 v5, v5, 0x1

    add-int/2addr v4, v2

    goto :goto_0

    :cond_1
    :goto_1
    const/4 v5, 0x0

    :cond_2
    add-int/2addr v1, v5

    .line 36
    iput v1, p0, Ll/ۤܰۗ;->ۚ:I

    .line 37
    iput v3, p0, Ll/ۤܰۗ;->ۧ:I

    return-void

    .line 39
    :cond_3
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۙ(Ll/ۧܰۗ;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 233
    :cond_0
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    .line 118
    invoke-direct {p0, p1, v0}, Ll/ۤܰۗ;->ۙ(Ll/ۧܰۗ;I)V

    return-void
.end method

.method public final ۙ(Ll/ܺܰۗ;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 110
    :cond_0
    new-instance v0, Ll/ܶܰۗ;

    const/4 v1, -0x1

    .line 16
    invoke-direct {v0, p1, v1}, Ll/ܶܰۗ;-><init>(Ll/ܺܰۗ;I)V

    .line 110
    invoke-virtual {p0, v0}, Ll/ۤܰۗ;->ۙ(Ll/ۧܰۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ܽܰۗ;)V
    .locals 2

    .line 233
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    .line 102
    iget v1, p0, Ll/ۤܰۗ;->ۧ:I

    sub-int/2addr v0, v1

    .line 126
    invoke-direct {p0, p1, v0}, Ll/ۤܰۗ;->ۙ(Ll/ۧܰۗ;I)V

    return-void
.end method

.method public final ۚ()V
    .locals 2

    .line 83
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܳܰۗ;->᩸:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    iget v0, p0, Ll/ۤܰۗ;->ۚ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۤܰۗ;->ۚ:I

    const/4 v0, 0x0

    .line 85
    iput v0, p0, Ll/ۤܰۗ;->ۧ:I

    return-void
.end method

.method public final ᩷(I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 141
    :cond_0
    iget v0, p0, Ll/ۤܰۗ;->ۚ:I

    .line 145
    iget-object v1, p0, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 146
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    iput-object v1, p0, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    .line 148
    :cond_1
    iget-object v1, p0, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ᩻()Ll/᩹ۘۗ;
    .locals 4

    .line 153
    iget-object v0, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 154
    iput-object v1, p0, Ll/ܳܰۗ;->ۙ:Ljava/lang/StringBuilder;

    .line 155
    new-instance v1, Ll/᩷ܰۗ;

    iget-object v2, p0, Ll/ۤܰۗ;->֫:Ljava/util/Map;

    iget-object v3, p0, Ll/ۤܰۗ;->۫:Ljava/util/Map;

    invoke-direct {v1, v0, v2, v3}, Ll/᩷ܰۗ;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method
