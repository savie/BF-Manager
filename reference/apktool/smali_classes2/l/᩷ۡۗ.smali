.class public final Ll/᩷ۡۗ;
.super Ll/ܺ۟ۗ;
.source "VIWQ"

# interfaces
.implements Ll/᩹ۡۗ;
.implements Ljava/lang/Comparable;


# instance fields
.field public ֡:Ljava/util/List;

.field public ֨:Ll/᩷ۡۗ;

.field public final ۖ:Ljava/util/ArrayList;

.field public final ۙۙ:I

.field public ۜ:Ljava/util/BitSet;

.field public ۟:Ljava/util/BitSet;

.field public ۠:I

.field public ۡ:Ll/᩷ۡۗ;

.field public ۢ:Ljava/util/BitSet;

.field public ۬:Ljava/util/List;

.field public final ܿ:I

.field public ᩳ:Ljava/util/List;

.field public ᩷ۙ:Ljava/util/List;


# direct methods
.method public constructor <init>(III)V
    .locals 2

    .line 73
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩷ۡۗ;->ۖ:Ljava/util/ArrayList;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩷ۡۗ;->۬:Ljava/util/List;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩷ۡۗ;->᩷ۙ:Ljava/util/List;

    .line 46
    sget-object v0, Ll/᩵֫᩵;->ܰ:Ll/᩵֫᩵;

    iput-object v0, p0, Ll/᩷ۡۗ;->ۢ:Ljava/util/BitSet;

    .line 51
    iput-object v0, p0, Ll/᩷ۡۗ;->ۜ:Ljava/util/BitSet;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩷ۡۗ;->ᩳ:Ljava/util/List;

    .line 74
    iput p1, p0, Ll/᩷ۡۗ;->ܿ:I

    .line 75
    iput p2, p0, Ll/᩷ۡۗ;->۠:I

    .line 76
    iput p3, p0, Ll/᩷ۡۗ;->ۙۙ:I

    return-void
.end method

.method public static ᩷(Ljava/util/List;)V
    .locals 3

    .line 116
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 118
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 84
    iput v1, v2, Ll/᩷ۡۗ;->۠:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 20
    check-cast p1, Ll/᩷ۡۗ;

    .line 270
    iget v0, p0, Ll/᩷ۡۗ;->ܿ:I

    iget p1, p1, Ll/᩷ۡۗ;->ܿ:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 261
    :cond_0
    instance-of v1, p1, Ll/᩷ۡۗ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 264
    :cond_1
    check-cast p1, Ll/᩷ۡۗ;

    .line 265
    iget v1, p0, Ll/᩷ۡۗ;->ܿ:I

    iget p1, p1, Ll/᩷ۡۗ;->ܿ:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final getId()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 92
    iget v0, p0, Ll/᩷ۡۗ;->۠:I

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 253
    iget v0, p0, Ll/᩷ۡۗ;->ܿ:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 280
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "B:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩷ۡۗ;->ܿ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩷ۡۗ;->ۙۙ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۖ()I
    .locals 1

    .line 80
    iget v0, p0, Ll/᩷ۡۗ;->ܿ:I

    return v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/᩷ۡۗ;->ۖ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۙ(Ljava/util/BitSet;)V
    .locals 0

    .line 205
    iput-object p1, p0, Ll/᩷ۡۗ;->۟:Ljava/util/BitSet;

    return-void
.end method

.method public final synthetic ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ܶۡۗ;->ۙ(Ll/᩹ۡۗ;Ll/۬֡ۗ;Ll/ۗۘۗ;)V

    return-void
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 1

    .line 232
    iget-object v0, p0, Ll/᩷ۡۗ;->ᩳ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۙۙ()Ljava/util/List;
    .locals 1

    .line 228
    iget-object v0, p0, Ll/᩷ۡۗ;->ᩳ:Ljava/util/List;

    return-object v0
.end method

.method public final ۚۙ()Ljava/util/BitSet;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/᩷ۡۗ;->ۜ:Ljava/util/BitSet;

    return-object v0
.end method

.method public final ۜ()Ljava/util/BitSet;
    .locals 1

    .line 201
    iget-object v0, p0, Ll/᩷ۡۗ;->۟:Ljava/util/BitSet;

    return-object v0
.end method

.method public final ۠()Ljava/util/List;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/᩷ۡۗ;->֡:Ljava/util/List;

    return-object v0
.end method

.method public final ۤ(Ljava/util/BitSet;)V
    .locals 0

    .line 197
    iput-object p1, p0, Ll/᩷ۡۗ;->ۜ:Ljava/util/BitSet;

    return-void
.end method

.method public final ۤ(Ll/᩷ۡۗ;)V
    .locals 0

    .line 216
    iput-object p1, p0, Ll/᩷ۡۗ;->ۡ:Ll/᩷ۡۗ;

    return-void
.end method

.method public final ۤۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 212
    iget-object v0, p0, Ll/᩷ۡۗ;->ۡ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۧۙ()Ljava/util/List;
    .locals 1

    .line 100
    iget-object v0, p0, Ll/᩷ۡۗ;->۬:Ljava/util/List;

    return-object v0
.end method

.method public final ۫ۙ()I
    .locals 1

    .line 96
    iget v0, p0, Ll/᩷ۡۗ;->۠:I

    return v0
.end method

.method public final ܶۙ()V
    .locals 4

    const-string v0, "Dominance frontier not set for block: "

    .line 124
    :try_start_0
    iget-object v1, p0, Ll/᩷ۡۗ;->᩷ۙ:Ljava/util/List;

    .line 125
    invoke-static {v1}, Ll/ۘۧ᩵;->ۤ(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/᩷ۡۗ;->᩷ۙ:Ljava/util/List;

    .line 126
    iget-object v3, p0, Ll/᩷ۡۗ;->֡:Ljava/util/List;

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v3}, Ll/ۘۧ᩵;->ۤ(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    :goto_0
    iput-object v2, p0, Ll/᩷ۡۗ;->֡:Ljava/util/List;

    .line 127
    iget-object v1, p0, Ll/᩷ۡۗ;->۬:Ljava/util/List;

    invoke-static {v1}, Ll/ۘۧ᩵;->ۤ(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩷ۡۗ;->۬:Ljava/util/List;

    .line 128
    iget-object v1, p0, Ll/᩷ۡۗ;->ᩳ:Ljava/util/List;

    invoke-static {v1}, Ll/ۘۧ᩵;->ۤ(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩷ۡۗ;->ᩳ:Ljava/util/List;

    .line 129
    iget-object v1, p0, Ll/᩷ۡۗ;->۟:Ljava/util/BitSet;

    if-eqz v1, :cond_1

    return-void

    .line 130
    :cond_1
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 130
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 133
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to lock block: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 15
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    throw v1
.end method

.method public final ܺۙ()Ljava/util/List;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/᩷ۡۗ;->᩷ۙ:Ljava/util/List;

    return-object v0
.end method

.method public final ܽۙ()Z
    .locals 1

    .line 248
    iget-object v0, p0, Ll/᩷ۡۗ;->ۖ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ᩴۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 220
    iget-object v0, p0, Ll/᩷ۡۗ;->֨:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ᩷(Ljava/util/BitSet;)V
    .locals 0

    .line 189
    iput-object p1, p0, Ll/᩷ۡۗ;->ۢ:Ljava/util/BitSet;

    return-void
.end method

.method public final ᩷(Ll/᩷ۡۗ;)Z
    .locals 1

    .line 178
    iget-object v0, p0, Ll/᩷ۡۗ;->ۢ:Ljava/util/BitSet;

    .line 96
    iget p1, p1, Ll/᩷ۡۗ;->۠:I

    .line 178
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method

.method public final ᩷ۙ()Ljava/util/BitSet;
    .locals 1

    .line 185
    iget-object v0, p0, Ll/᩷ۡۗ;->ۢ:Ljava/util/BitSet;

    return-object v0
.end method

.method public final ᩸(Ll/᩷ۡۗ;)V
    .locals 0

    .line 224
    iput-object p1, p0, Ll/᩷ۡۗ;->֨:Ll/᩷ۡۗ;

    return-void
.end method

.method public final ᩹ۙ()V
    .locals 5

    .line 104
    iget-object v0, p0, Ll/᩷ۡۗ;->᩷ۙ:Ljava/util/List;

    .line 142
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 145
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 146
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 147
    invoke-static {v3}, Ll/᩹֫᩵;->۫(Ll/᩷ۡۗ;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 148
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 151
    :cond_2
    sget-object v2, Ll/֫۟ۗ;->᩶ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 152
    sget-object v2, Ll/ۧ۟ۗ;->ܰ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v2

    .line 153
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧᩳۗ;

    .line 154
    invoke-virtual {v3}, Ll/ۧᩳۗ;->ۚ()Ll/᩷ۡۗ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 157
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    .line 160
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 161
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    move-object v0, v2

    .line 112
    :goto_2
    iput-object v0, p0, Ll/᩷ۡۗ;->֡:Ljava/util/List;

    return-void
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    .line 275
    iget v0, p0, Ll/᩷ۡۗ;->ܿ:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻ۙ()I
    .locals 1

    .line 171
    iget v0, p0, Ll/᩷ۡۗ;->ۙۙ:I

    return v0
.end method
