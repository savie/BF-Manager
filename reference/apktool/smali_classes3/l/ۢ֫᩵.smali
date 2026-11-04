.class public final Ll/ۢ֫᩵;
.super Ljava/lang/Object;
.source "A6IB"


# instance fields
.field public ۙ:Ljava/util/List;

.field public final ۤ:Ljava/util/ArrayList;

.field public final ᩷:Ll/ۖۡۗ;


# direct methods
.method public constructor <init>(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p2, p0, Ll/ۢ֫᩵;->᩷:Ll/ۖۡۗ;

    .line 47
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ۢ֫᩵;->ۤ:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    .line 49
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ֫᩵;->ۙ:Ljava/util/List;

    :cond_0
    return-void
.end method

.method public static ۙ(Ljava/util/List;Ljava/util/List;)V
    .locals 4

    if-eqz p1, :cond_3

    .line 192
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 195
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    .line 196
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    .line 199
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_2

    .line 200
    invoke-interface {p0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;)V
    .locals 5

    .line 277
    new-instance v0, Ll/ۢ֫᩵;

    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, v1, p0}, Ll/ۢ֫᩵;-><init>(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    .line 278
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 279
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 280
    sget-object v4, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 281
    invoke-virtual {v0, v3}, Ll/ۢ֫᩵;->᩷(Ll/ᩳۡۗ;)V

    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Ll/ۢ֫᩵;->ۙ:Ljava/util/List;

    .line 285
    invoke-virtual {v0}, Ll/ۢ֫᩵;->ۙ()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/List;)V
    .locals 1

    .line 266
    invoke-static {p0, p1}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/List;)V

    .line 267
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 268
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۢ֫᩵;->ۙ(Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V
    .locals 1

    .line 177
    instance-of v0, p1, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    .line 178
    check-cast p1, Ll/ۛ֨ۗ;

    .line 179
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 181
    invoke-virtual {p0, p1}, Ll/ܿ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)V

    return-void

    .line 183
    :cond_0
    instance-of v0, p1, Ll/ܽ֨ۗ;

    if-eqz v0, :cond_1

    .line 184
    check-cast p1, Ll/ܽ֨ۗ;

    .line 185
    invoke-virtual {p1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 218
    :cond_0
    sget-object v0, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    invoke-static {p0, p1}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    return-void

    .line 222
    :cond_1
    invoke-static {p0, p1}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/᩷ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 224
    invoke-static {p0, v0, p1}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V

    return-void

    .line 226
    :cond_2
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not found block with instruction: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۢۗ;)V
    .locals 3

    .line 296
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 297
    sget-object v1, Ll/ۧ۟ۗ;->ۖ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ۛᩳۗ;

    if-eqz v0, :cond_0

    .line 299
    invoke-virtual {v0}, Ll/ۛᩳۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/ܿ֫᩵;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ll/ܿ֫᩵;-><init>(ILjava/lang/Object;)V

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/ArrayList;)V
    .locals 0

    .line 256
    invoke-static {p0, p2}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/List;)V

    .line 257
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p2}, Ll/ۢ֫᩵;->ۙ(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V
    .locals 2

    .line 232
    sget-object v0, Ll/֫۟ۗ;->ۚۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Instruction removed from duplicated block: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", please report this as an issue"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 235
    :cond_0
    invoke-static {p0, p2}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 236
    invoke-static {p0, p1, p2}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)Z

    return-void
.end method

.method public static ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V
    .locals 0

    .line 101
    invoke-static {p0, p1}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 102
    invoke-static {p0, p1}, Ll/ۢ֫᩵;->᩸(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 103
    sget-object p0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;Ljava/util/List;)V
    .locals 2

    .line 108
    new-instance v0, Ll/ܽۛܳ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/ܽۛܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 109
    new-instance v0, Ll/ᩳ֫᩵;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ᩳ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V
    .locals 2

    .line 116
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 117
    invoke-static {p0, v1}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object p0

    sget-object v0, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne p0, v0, :cond_2

    .line 120
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    .line 121
    instance-of v1, v0, Ll/ۛ֨ۗ;

    if-eqz v1, :cond_1

    .line 122
    check-cast v0, Ll/ۛ֨ۗ;

    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ֨ۗ;->۟()V

    goto :goto_1

    .line 126
    :cond_2
    sget-object p0, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 127
    sget-object p0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, p0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/ᩳۡۗ;)Z
    .locals 2

    .line 241
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 242
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 243
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    if-ne v1, p2, :cond_0

    .line 245
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 p0, 0x1

    return p0

    .line 249
    :cond_1
    sget-object v0, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 250
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to remove instruction: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " from block: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩸(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V
    .locals 5

    .line 131
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p0, :cond_7

    .line 136
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 137
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩸()Ll/ᩳۡۗ;

    move-result-object v1

    if-ne v1, p1, :cond_7

    .line 145
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩹()I

    move-result v1

    if-nez v1, :cond_1

    .line 147
    invoke-virtual {p0, v0}, Ll/ۖۡۗ;->ۙ(Ll/ܿ֨ۗ;)V

    goto/16 :goto_2

    .line 151
    :cond_1
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ll/֡֫᩵;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ll/֡֫᩵;-><init>(I)V

    invoke-static {v2, v3}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ljava/util/function/Predicate;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 152
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 153
    invoke-virtual {v2}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 155
    check-cast v3, Ll/ᩳۢۗ;

    invoke-virtual {v3, v2}, Ll/ᩳۢۗ;->ۤ(Ll/ۛ֨ۗ;)V

    goto :goto_0

    .line 158
    :cond_3
    invoke-virtual {p0, v0}, Ll/ۖۡۗ;->ۙ(Ll/ܿ֨ۗ;)V

    goto :goto_2

    .line 162
    :cond_4
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ll/۟֫᩵;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Ll/۟֫᩵;-><init>(I)V

    invoke-static {v2, v3}, Ll/ۜ֫᩵;->ۙ(Ljava/util/List;Ljava/util/function/Predicate;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 164
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 165
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->ۗۙ()V

    goto :goto_1

    .line 167
    :cond_5
    invoke-virtual {p0, v0}, Ll/ۖۡۗ;->ۙ(Ll/ܿ֨ۗ;)V

    goto :goto_2

    .line 170
    :cond_6
    new-instance p0, Ll/۠ۧ᩵;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t remove SSA var: "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", still in use, count: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", list:\n  "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/۟ۨᩴ;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ll/۟ۨᩴ;-><init>(I)V

    .line 172
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    const-string v1, "\n  "

    .line 173
    invoke-static {v1}, Ll/֫ܺۗ;->joining(Ljava/lang/CharSequence;)Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 173
    throw p0

    :cond_7
    :goto_2
    const/4 p0, 0x0

    .line 141
    invoke-virtual {p1, p0}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 4

    .line 67
    iget-object v0, p0, Ll/ۢ֫᩵;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 70
    :cond_0
    iget-object v1, p0, Ll/ۢ֫᩵;->ۙ:Ljava/util/List;

    iget-object v2, p0, Ll/ۢ֫᩵;->᩷:Ll/ۖۡۗ;

    if-nez v1, :cond_1

    .line 71
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 72
    invoke-static {v2, v3}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    goto :goto_0

    .line 75
    :cond_1
    invoke-static {v2, v0}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/List;)V

    .line 76
    iget-object v1, p0, Ll/ۢ֫᩵;->ۙ:Ljava/util/List;

    invoke-static {v1, v0}, Ll/ۢ֫᩵;->ۙ(Ljava/util/List;Ljava/util/List;)V

    .line 78
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ۙ(Ll/ᩳۡۗ;)V
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۢ֫᩵;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    iget-object v0, p0, Ll/ۢ֫᩵;->᩷:Ll/ۖۡۗ;

    invoke-static {v0, p1}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    return-void
.end method

.method public final ۙ(Ll/᩷ۡۗ;)V
    .locals 2

    .line 91
    iget-object v0, p0, Ll/ۢ֫᩵;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 94
    :cond_0
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۢ֫᩵;->ۙ:Ljava/util/List;

    .line 95
    iget-object p1, p0, Ll/ۢ֫᩵;->᩷:Ll/ۖۡۗ;

    invoke-static {p1, v0}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ljava/util/List;)V

    .line 96
    iget-object p1, p0, Ll/ۢ֫᩵;->ۙ:Ljava/util/List;

    invoke-static {p1, v0}, Ll/ۢ֫᩵;->ۙ(Ljava/util/List;Ljava/util/List;)V

    .line 97
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 83
    iget-object v0, p0, Ll/ۢ֫᩵;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 86
    :cond_0
    iget-object v1, p0, Ll/ۢ֫᩵;->᩷:Ll/ۖۡۗ;

    invoke-static {v1, v0}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ljava/util/List;)V

    .line 87
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ᩷(Ll/ᩳۡۗ;)V
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۢ֫᩵;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ᩷(Ll/᩷ۡۗ;)V
    .locals 0

    .line 54
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ֫᩵;->ۙ:Ljava/util/List;

    return-void
.end method
