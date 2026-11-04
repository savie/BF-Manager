.class public final Ll/֫۫᩵;
.super Ljava/lang/Object;
.source "O6FE"


# instance fields
.field public final ۙ:Ll/ۖۡۗ;

.field public final ۤ:Ll/۠ܳ᩵;

.field public final ᩷:Ll/ۧ۫᩵;

.field public final ᩸:Ll/ۢ۫᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    const-class v0, Ll/֫۫᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۖۡۗ;)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/֫۫᩵;->ۙ:Ll/ۖۡۗ;

    .line 48
    new-instance v0, Ll/ۧ۫᩵;

    invoke-direct {v0, p1}, Ll/ۧ۫᩵;-><init>(Ll/ۖۡۗ;)V

    iput-object v0, p0, Ll/֫۫᩵;->᩷:Ll/ۧ۫᩵;

    .line 49
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֫ۖۗ;->ܶۙ()Ll/ۢ۫᩵;

    move-result-object p1

    iput-object p1, p0, Ll/֫۫᩵;->᩸:Ll/ۢ۫᩵;

    .line 50
    invoke-virtual {p1}, Ll/ۢ۫᩵;->ۙ()Ll/۠ܳ᩵;

    move-result-object p1

    iput-object p1, p0, Ll/֫۫᩵;->ۤ:Ll/۠ܳ᩵;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/֫۫᩵;)Ll/۠ܳ᩵;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫۫᩵;->ۤ:Ll/۠ܳ᩵;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ۛܳ᩵;)Ll/᩵ܺۗ;
    .locals 0

    .line 172
    invoke-interface {p0}, Ll/ۛܳ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(Ll/ۛ֨ۗ;)Ll/᩸ܳ᩵;
    .locals 3

    .line 355
    invoke-virtual {p1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 356
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ۖ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 359
    :cond_0
    sget-object v1, Ll/ۚ۫᩵;->ۙ:[I

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 388
    :cond_1
    new-instance v1, Ll/۫۫᩵;

    invoke-direct {v1, v0, p1}, Ll/᩸ܳ᩵;-><init>(Ll/ᩳۡۗ;Ll/ܺ֨ۗ;)V

    return-object v1

    :cond_2
    const/4 v1, 0x0

    .line 373
    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v1, Ll/ۛ֨ۗ;

    if-nez v1, :cond_3

    goto :goto_0

    .line 376
    :cond_3
    new-instance v1, Ll/ܳ۫᩵;

    invoke-direct {v1, p0, v0, p1}, Ll/ܳ۫᩵;-><init>(Ll/֫۫᩵;Ll/ᩳۡۗ;Ll/ۛ֨ۗ;)V

    return-object v1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ۙ(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V
    .locals 2

    .line 281
    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֨ۗ;

    .line 289
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩶()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/֫۫᩵;->᩸:Ll/ۢ۫᩵;

    invoke-virtual {v1, p1, v0}, Ll/ۢ۫᩵;->ۙ(Ljava/util/LinkedHashSet;Ll/֫֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 290
    invoke-interface {p2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 291
    invoke-interface {p2}, Ljava/util/Set;->size()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/֫۫᩵;Ll/ܿ֨ۗ;)V
    .locals 11

    .line 211
    iget-object v0, p0, Ll/֫۫᩵;->ۙ:Ll/ۖۡۗ;

    iget-object v1, p0, Ll/֫۫᩵;->᩷:Ll/ۧ۫᩵;

    invoke-virtual {v1, p1}, Ll/ۧ۫᩵;->ۙ(Ll/ܿ֨ۗ;)Ll/᩻۫᩵;

    move-result-object v1

    .line 212
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 214
    invoke-virtual {v1, v2}, Ll/᩻۫᩵;->ۙ(Ll/֫֨ۗ;)V

    return-void

    .line 217
    :cond_0
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v2

    .line 218
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩶()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 219
    invoke-virtual {v1, v2}, Ll/᩻۫᩵;->ۙ(Ll/֫֨ۗ;)V

    return-void

    .line 223
    :cond_1
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 224
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 225
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v4

    .line 226
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩵ܳ᩵;

    .line 227
    invoke-interface {v6}, Ll/᩵ܳ᩵;->ۙ()Ll/ܳܳ᩵;

    move-result-object v7

    sget-object v8, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    if-ne v7, v8, :cond_2

    .line 228
    invoke-interface {v6}, Ll/᩵ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 230
    :cond_2
    invoke-interface {v6}, Ll/᩵ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 234
    :cond_3
    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 235
    invoke-direct {p0, v4, v5, v2}, Ll/֫۫᩵;->ۙ(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    .line 236
    invoke-direct {p0, v4, v5, v3}, Ll/֫۫᩵;->ۙ(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    .line 238
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫֨ۗ;

    .line 299
    invoke-virtual {v6}, Ll/֫֨ۗ;->᩶()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 300
    invoke-virtual {v6}, Ll/֫֨ۗ;->ۘ()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 301
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v7

    invoke-virtual {v6}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ll/᩷֡ۗ;->᩷(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v6

    .line 302
    invoke-static {v6}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v6

    new-instance v7, Ll/ᩴۡۗ;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Ll/ᩴۡۗ;-><init>(I)V

    invoke-interface {v6, v7}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v6

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v7

    invoke-interface {v6, v7}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    goto :goto_3

    .line 307
    :cond_4
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_3

    .line 327
    :cond_5
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 328
    invoke-virtual {v6}, Ll/֫֨ۗ;->ܽ()[Ll/ۨ֨ۗ;

    move-result-object v6

    array-length v9, v6

    :goto_2
    if-ge v7, v9, :cond_6

    aget-object v10, v6, v7

    .line 329
    invoke-static {v10}, Ll/֫֨ۗ;->ۤ(Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_6
    move-object v6, v8

    .line 239
    :goto_3
    invoke-direct {p0, v4, v5, v6}, Ll/֫۫᩵;->ۙ(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    goto :goto_1

    .line 241
    :cond_7
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫֨ۗ;

    .line 311
    invoke-virtual {v3}, Ll/֫֨ۗ;->᩶()Z

    move-result v6

    if-eqz v6, :cond_a

    .line 312
    invoke-virtual {v3}, Ll/֫֨ۗ;->ۘ()Z

    move-result v6

    if-eqz v6, :cond_9

    .line 313
    sget-object v6, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    invoke-virtual {v3, v6}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    .line 315
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_6

    .line 317
    :cond_8
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v6

    invoke-virtual {v6}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v6

    invoke-virtual {v3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ll/᩷֡ۗ;->ۙ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 318
    invoke-static {v3}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v3

    new-instance v6, Ll/ᩴۡۗ;

    const/4 v8, 0x0

    invoke-direct {v6, v8}, Ll/ᩴۡۗ;-><init>(I)V

    invoke-interface {v3, v6}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v3

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v6

    invoke-interface {v3, v6}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    goto :goto_6

    .line 323
    :cond_9
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_6

    .line 327
    :cond_a
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 328
    invoke-virtual {v3}, Ll/֫֨ۗ;->ܽ()[Ll/ۨ֨ۗ;

    move-result-object v3

    array-length v8, v3

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_b

    aget-object v10, v3, v9

    .line 329
    invoke-static {v10}, Ll/֫֨ۗ;->ۤ(Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_b
    move-object v3, v6

    .line 242
    :goto_6
    invoke-direct {p0, v4, v5, v3}, Ll/֫۫᩵;->ۙ(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Ljava/util/Collection;)V

    goto :goto_4

    .line 266
    :cond_c
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_d
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֨ۗ;

    .line 267
    invoke-virtual {v0}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 269
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    .line 270
    sget-object v3, Ll/᩺ۢۗ;->ܿ:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_d

    const/4 v2, 0x2

    .line 271
    invoke-virtual {v0, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    .line 272
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩶()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 273
    invoke-static {v0}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    .line 289
    invoke-virtual {v0}, Ll/֫֨ۗ;->᩶()Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v2, p0, Ll/֫۫᩵;->᩸:Ll/ۢ۫᩵;

    invoke-virtual {v2, v4, v0}, Ll/ۢ۫᩵;->ۙ(Ljava/util/LinkedHashSet;Ll/֫֨ۗ;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 290
    invoke-interface {v5, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 291
    invoke-interface {v5}, Ljava/util/Set;->size()I

    goto :goto_7

    .line 247
    :cond_e
    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_f

    .line 249
    invoke-virtual {v1, v0}, Ll/᩻۫᩵;->ۙ(Z)V

    .line 250
    sget-object p0, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    invoke-virtual {v1, p0}, Ll/᩻۫᩵;->᩷(Ll/֫֨ۗ;)V

    .line 251
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v1, p0}, Ll/᩻۫᩵;->ۙ(Ljava/util/List;)V

    return-void

    :cond_f
    if-ne p1, v0, :cond_10

    .line 253
    invoke-virtual {v1, v0}, Ll/᩻۫᩵;->ۙ(Z)V

    .line 254
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫֨ۗ;

    invoke-virtual {v1, p0}, Ll/᩻۫᩵;->᩷(Ll/֫֨ۗ;)V

    .line 255
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v1, p0}, Ll/᩻۫᩵;->ۙ(Ljava/util/List;)V

    return-void

    .line 257
    :cond_10
    invoke-virtual {v1, v7}, Ll/᩻۫᩵;->ۙ(Z)V

    .line 258
    sget-object p1, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    invoke-virtual {v1, p1}, Ll/᩻۫᩵;->᩷(Ll/֫֨ۗ;)V

    .line 259
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 260
    iget-object p0, p0, Ll/֫۫᩵;->ۤ:Ll/۠ܳ᩵;

    invoke-virtual {p0}, Ll/۠ܳ᩵;->᩷()Ljava/util/Comparator;

    move-result-object p0

    invoke-static {p1, p0}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 261
    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v1, p0}, Ll/᩻۫᩵;->ۙ(Ljava/util/List;)V

    return-void
.end method

.method public static ۙ(Ll/֫۫᩵;Ll/᩻۫᩵;)V
    .locals 3

    .line 171
    invoke-virtual {p1}, Ll/᩻۫᩵;->ۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩸ۧ᩺;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ll/᩸ۧ᩺;-><init>(I)V

    .line 172
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ᩴ۫᩵;

    invoke-direct {v1, p0}, Ll/ᩴ۫᩵;-><init>(Ll/֫۫᩵;)V

    .line 173
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->allMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 178
    :cond_0
    invoke-virtual {p1}, Ll/᩻۫᩵;->ܳ()V

    .line 180
    :cond_1
    invoke-direct {p0, p1}, Ll/֫۫᩵;->ۙ(Ll/᩻۫᩵;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x1

    .line 181
    invoke-virtual {p1, p0}, Ll/᩻۫᩵;->ۙ(Z)V

    return-void

    .line 184
    :cond_2
    invoke-virtual {p1}, Ll/᩻۫᩵;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void
.end method

.method private ۙ(Ll/᩻۫᩵;)Z
    .locals 2

    .line 199
    invoke-virtual {p1}, Ll/᩻۫᩵;->᩸()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    invoke-virtual {p1}, Ll/᩻۫᩵;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛܳ᩵;

    .line 203
    iget-object v1, p0, Ll/֫۫᩵;->᩷:Ll/ۧ۫᩵;

    invoke-interface {v0, v1}, Ll/ۛܳ᩵;->ۙ(Ll/ۧ۫᩵;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public static synthetic ۤ(Ll/֫۫᩵;Ll/ܿ֨ۗ;)Z
    .locals 0

    .line 173
    iget-object p0, p0, Ll/֫۫᩵;->᩷:Ll/ۧ۫᩵;

    invoke-virtual {p0, p1}, Ll/ۧ۫᩵;->ۙ(Ll/ܿ֨ۗ;)Ll/᩻۫᩵;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩻۫᩵;->᩸()Z

    move-result p0

    return p0
.end method

.method public static ᩷(Ll/֫۫᩵;Ll/ܿ֨ۗ;)V
    .locals 3

    .line 335
    iget-object v0, p0, Ll/֫۫᩵;->᩷:Ll/ۧ۫᩵;

    invoke-virtual {v0, p1}, Ll/ۧ۫᩵;->ۙ(Ll/ܿ֨ۗ;)Ll/᩻۫᩵;

    move-result-object v0

    .line 336
    invoke-virtual {v0}, Ll/᩻۫᩵;->᩸()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 337
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v0, p0}, Ll/᩻۫᩵;->᩷(Ljava/util/List;)V

    return-void

    .line 340
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1}, Ll/᩻۫᩵;->᩷(Ljava/util/List;)V

    .line 341
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/֫۫᩵;->ۙ(Ll/ۛ֨ۗ;)Ll/᩸ܳ᩵;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 349
    invoke-virtual {v0}, Ll/᩻۫᩵;->ۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 342
    :cond_1
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨ۗ;

    .line 343
    invoke-direct {p0, v1}, Ll/֫۫᩵;->ۙ(Ll/ۛ֨ۗ;)Ll/᩸ܳ᩵;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 349
    invoke-virtual {v0}, Ll/᩻۫᩵;->ۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-void
.end method


# virtual methods
.method public final ۙ()Z
    .locals 9

    .line 54
    iget-object v0, p0, Ll/֫۫᩵;->ۙ:Ll/ۖۡۗ;

    invoke-virtual {v0}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x1388

    const/4 v3, 0x0

    if-le v1, v2, :cond_0

    .line 55
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Multi-variable search skipped. Vars limit reached: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " (expected less than 5000)"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return v3

    .line 59
    :cond_0
    invoke-virtual {v0}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/ۚ᩷᩵;

    const/4 v4, 0x1

    invoke-direct {v2, v4, p0}, Ll/ۚ᩷᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 60
    invoke-virtual {v0}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/ۤ۟ۗ;

    invoke-direct {v2, v4, p0}, Ll/ۤ۟ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 63
    iget-object v1, p0, Ll/֫۫᩵;->᩷:Ll/ۧ۫᩵;

    invoke-virtual {v1}, Ll/ۧ۫᩵;->᩷()Ljava/util/List;

    move-result-object v2

    new-instance v4, Ll/֨ۖ᩺;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p0}, Ll/֨ۖ᩺;-><init>(ILjava/lang/Object;)V

    invoke-static {v2, v4}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 66
    invoke-virtual {v1}, Ll/ۧ۫᩵;->᩷()Ljava/util/List;

    move-result-object v2

    .line 67
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_4

    .line 110
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    .line 126
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻۫᩵;

    .line 127
    invoke-virtual {v7}, Ll/᩻۫᩵;->ܳ()V

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    .line 190
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩻۫᩵;

    .line 191
    invoke-direct {p0, v8}, Ll/֫۫᩵;->ۙ(Ll/᩻۫᩵;)Z

    move-result v8

    if-nez v8, :cond_4

    .line 133
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻۫᩵;

    .line 134
    invoke-virtual {v7}, Ll/᩻۫᩵;->ᩴ()Z

    move-result v7

    if-eqz v7, :cond_7

    if-lt v5, v4, :cond_5

    goto :goto_2

    .line 139
    :cond_5
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻۫᩵;

    const/4 v8, 0x1

    .line 141
    :goto_1
    invoke-virtual {v7}, Ll/᩻۫᩵;->ᩴ()Z

    move-result v7

    if-eqz v7, :cond_7

    add-int/2addr v8, v5

    if-lt v8, v4, :cond_6

    goto :goto_2

    .line 146
    :cond_6
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻۫᩵;

    goto :goto_1

    :cond_7
    add-int/2addr v6, v5

    const v7, 0xf4240

    if-le v6, v7, :cond_3

    :goto_2
    return v3

    .line 164
    :cond_8
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻۫᩵;

    .line 165
    invoke-virtual {v6, v5}, Ll/᩻۫᩵;->ۙ(Z)V

    goto :goto_3

    .line 190
    :cond_9
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩻۫᩵;

    .line 191
    invoke-direct {p0, v4}, Ll/֫۫᩵;->ۙ(Ll/᩻۫᩵;)Z

    move-result v4

    if-nez v4, :cond_a

    return v3

    .line 82
    :cond_b
    :goto_4
    invoke-virtual {v1}, Ll/ۧ۫᩵;->ۙ()Ljava/util/List;

    move-result-object v1

    .line 83
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 84
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻۫᩵;

    .line 85
    invoke-virtual {v3}, Ll/᩻۫᩵;->ۤ()Ll/ܿ֨ۗ;

    move-result-object v4

    .line 86
    invoke-virtual {v3}, Ll/᩻۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v6

    .line 87
    invoke-virtual {v6}, Ll/֫֨ۗ;->᩶()Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_5

    .line 91
    :cond_c
    invoke-virtual {v4}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    goto :goto_5

    .line 95
    :cond_d
    invoke-virtual {v4, v6}, Ll/ܿ֨ۗ;->᩷(Ll/֫֨ۗ;)V

    .line 96
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 99
    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_f
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻۫᩵;

    .line 100
    invoke-virtual {v2}, Ll/᩻۫᩵;->ۤ()Ll/ܿ֨ۗ;

    move-result-object v3

    invoke-virtual {v2}, Ll/᩻۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v4

    iget-object v6, p0, Ll/֫۫᩵;->᩸:Ll/ۢ۫᩵;

    invoke-virtual {v6, v0, v3, v4}, Ll/ۢ۫᩵;->᩸(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;

    move-result-object v3

    .line 101
    sget-object v4, Ll/ۙۚ᩵;->ܿ:Ll/ۙۚ᩵;

    if-ne v3, v4, :cond_f

    .line 102
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Multi-variable search result rejected for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    const/4 v5, 0x0

    goto :goto_6

    :cond_10
    return v5
.end method
