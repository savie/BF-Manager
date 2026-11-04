.class public final Ll/ܿ֨ۗ;
.super Ljava/lang/Object;
.source "J6I0"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ֨:Ljava/util/Comparator;


# instance fields
.field public final ֡:Ll/᩸۫᩵;

.field public final ۟:Ljava/util/ArrayList;

.field public final ۢ:I

.field public ܰ:Ll/ۛ֨ۗ;

.field public final ܿ:I

.field public ᩳ:Ljava/util/ArrayList;

.field public ᩶:Ll/ۧ֨ۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 29
    const-class v0, Ll/ܿ֨ۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    .line 31
    new-instance v0, Ll/ۘ֨ۗ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    invoke-static {v0}, Ll/ۖ۫ۗ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v0

    new-instance v1, Ll/᩻ۚۚ;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/᩻ۚۚ;-><init>(I)V

    invoke-static {v0, v1}, Ll/۠۫ۗ;->thenComparingInt(Ljava/util/Comparator;Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v0

    sput-object v0, Ll/ܿ֨ۗ;->֨:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(IILl/ۛ֨ۗ;)V
    .locals 2

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܿ֨ۗ;->۟:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    .line 41
    new-instance v0, Ll/᩸۫᩵;

    invoke-direct {v0}, Ll/᩸۫᩵;-><init>()V

    iput-object v0, p0, Ll/ܿ֨ۗ;->֡:Ll/᩸۫᩵;

    .line 47
    iput p1, p0, Ll/ܿ֨ۗ;->ܿ:I

    .line 48
    iput p2, p0, Ll/ܿ֨ۗ;->ۢ:I

    .line 49
    iput-object p3, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    .line 51
    invoke-virtual {p3, p0}, Ll/ۛ֨ۗ;->ۙ(Ll/ܿ֨ۗ;)V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 28
    check-cast p1, Ll/ܿ֨ۗ;

    .line 330
    sget-object v0, Ll/ܿ֨ۗ;->֨:Ljava/util/Comparator;

    invoke-interface {v0, p0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 316
    :cond_0
    instance-of v1, p1, Ll/ܿ֨ۗ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 319
    :cond_1
    check-cast p1, Ll/ܿ֨ۗ;

    .line 320
    iget v1, p0, Ll/ܿ֨ۗ;->ܿ:I

    iget v3, p1, Ll/ܿ֨ۗ;->ܿ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/ܿ֨ۗ;->ۢ:I

    iget p1, p1, Ll/ܿ֨ۗ;->ۢ:I

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ܿ֨ۗ;->᩶:Ll/ۧ֨ۗ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 226
    :cond_0
    invoke-virtual {v0}, Ll/ۧ֨ۗ;->ۤ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    .line 325
    iget v0, p0, Ll/ܿ֨ۗ;->ܿ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܿ֨ۗ;->ۢ:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 339
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ܿ֨ۗ;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 340
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v1

    sget v2, Ll/ۨۧ᩵;->᩷:I

    if-eqz v1, :cond_0

    .line 266
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 340
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܿ֨ۗ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿ֨ۗ;->֡:Ll/᩸۫᩵;

    .line 341
    invoke-virtual {v1}, Ll/᩸۫᩵;->᩷()Ll/֫֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 2

    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "r"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܿ֨ۗ;->ܿ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x76

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܿ֨ۗ;->ۢ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/ᩳۢۗ;
    .locals 2

    .line 170
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 171
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۢۗ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۘ()Z
    .locals 1

    .line 259
    iget-object v0, p0, Ll/ܿ֨ۗ;->᩶:Ll/ۧ֨ۗ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(Ll/ۖۡۗ;)Ljava/lang/String;
    .locals 6

    .line 263
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 264
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 266
    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Ll/ܿ֨ۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 267
    iget-object v4, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 270
    sget-object v3, Ll/ۧ۟ۗ;->ۘ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v3}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 271
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 272
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ֨ۗ;

    .line 273
    sget-object v4, Ll/ۧ۟ۗ;->ۜ:Ll/ۧ۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v3

    check-cast v3, Ll/᩺ᩳۗ;

    if-eqz v3, :cond_0

    .line 275
    invoke-virtual {v3}, Ll/᩺ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 276
    invoke-virtual {v3}, Ll/᩺ᩳۗ;->᩷()Ll/֫֨ۗ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 281
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 36
    iget-object v3, v2, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 283
    invoke-virtual {v3}, Ll/֫֨ۗ;->᩶()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 284
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 286
    :cond_3
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v2

    .line 287
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩶()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 288
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 291
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "r"

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    iget v2, p0, Ll/ܿ֨ۗ;->ܿ:I

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x76

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Ll/ܿ֨ۗ;->ۢ:I

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 293
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    const-string v3, "]"

    const-string v4, "["

    const-string v5, ", "

    if-nez v2, :cond_5

    .line 294
    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    .line 295
    invoke-interface {v1}, Ll/᩵ܺۗ;->sorted()Ll/᩵ܺۗ;

    move-result-object v1

    .line 296
    invoke-static {v5, v4, v3}, Ll/֫ܺۗ;->joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ll/ۚܺۗ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, ", names: "

    .line 298
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    :cond_5
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    .line 301
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩶֨ۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩶֨ۗ;-><init>(I)V

    .line 302
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    .line 303
    invoke-interface {v0}, Ll/᩵ܺۗ;->sorted()Ll/᩵ܺۗ;

    move-result-object v0

    .line 304
    invoke-static {v5, v4, v3}, Ll/֫ܺۗ;->joining(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, ", types: "

    .line 306
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    :cond_6
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ()Ll/ۛ֨ۗ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 215
    iget-object v0, p0, Ll/ܿ֨ۗ;->᩶:Ll/ۧ֨ۗ;

    if-eqz v0, :cond_0

    .line 218
    invoke-virtual {v0, p1}, Ll/ۧ֨ۗ;->ۙ(Ljava/lang/String;)V

    return-void

    .line 216
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CodeVar not initialized for name set in SSAVar: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 216
    throw p1

    :cond_1
    return-void
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 2

    .line 101
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    sget-object v1, Ll/֫۟ۗ;->᩺ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 102
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    .line 36
    iget-object v0, v0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 103
    invoke-virtual {v0, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    .line 56
    iput-object p1, v0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۛ֨ۗ;)V
    .locals 2

    .line 139
    new-instance v0, Ll/ܰ֨ۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Ll/ܰ֨ۗ;-><init>(ILjava/lang/Object;)V

    iget-object p1, p0, Ll/ܿ֨ۗ;->۟:Ljava/util/ArrayList;

    invoke-static {p1, v0}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    return-void
.end method

.method public final ۙ(Ll/ۧ֨ۗ;)V
    .locals 1

    .line 242
    iput-object p1, p0, Ll/ܿ֨ۗ;->᩶:Ll/ۧ֨ۗ;

    .line 243
    invoke-virtual {p1, p0}, Ll/ۧ֨ۗ;->ۙ(Ll/ܿ֨ۗ;)V

    .line 244
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 246
    invoke-virtual {p1, v0}, Ll/ۧ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ᩳۢۗ;)V
    .locals 2

    .line 143
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    .line 146
    :cond_0
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۛ()I
    .locals 1

    .line 59
    iget v0, p0, Ll/ܿ֨ۗ;->ۢ:I

    return v0
.end method

.method public final ۟()V
    .locals 4

    const/4 v0, 0x0

    .line 159
    iput-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    .line 160
    iget-object v0, p0, Ll/ܿ֨ۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨ۗ;

    .line 92
    iget-object v1, v1, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    if-eqz v1, :cond_0

    .line 162
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_0

    .line 163
    check-cast v1, Ll/ᩳۢۗ;

    invoke-virtual {p0, v1}, Ll/ܿ֨ۗ;->ۙ(Ll/ᩳۢۗ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۤ(Ll/ۛ֨ۗ;)V
    .locals 1

    .line 131
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 132
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ܿ֨ۗ;->ۙ(Ll/ۛ֨ۗ;)V

    .line 134
    :cond_0
    invoke-virtual {p1, p0}, Ll/ۛ֨ۗ;->ۙ(Ll/ܿ֨ۗ;)V

    .line 135
    iget-object v0, p0, Ll/ܿ֨ۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 3

    .line 63
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    .line 92
    iget-object v0, v0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    if-eqz v0, :cond_1

    .line 188
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    sget-object v2, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v1, v2, :cond_1

    .line 189
    check-cast v0, Ll/ᩳۢۗ;

    .line 190
    iget-object v1, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 191
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 193
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object v1

    .line 198
    :cond_1
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    .line 199
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_2
    return-object v0
.end method

.method public final ۨ()Ljava/util/List;
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 178
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_0
    return-object v0
.end method

.method public final ۫()Ll/֫֨ۗ;
    .locals 1

    .line 90
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    .line 36
    iget-object v0, v0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܰ()Z
    .locals 2

    .line 97
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    sget-object v1, Ll/֫۟ۗ;->᩺ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    return v0
.end method

.method public final ܺ()Ll/᩸۫᩵;
    .locals 1

    .line 230
    iget-object v0, p0, Ll/ܿ֨ۗ;->֡:Ll/᩸۫᩵;

    return-object v0
.end method

.method public final ܿ()V
    .locals 3

    .line 251
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->ܰ()Z

    move-result v0

    iget-object v1, p0, Ll/ܿ֨ۗ;->֡:Ll/᩸۫᩵;

    if-nez v0, :cond_0

    .line 252
    sget-object v0, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    .line 124
    invoke-virtual {v1, v0}, Ll/᩸۫᩵;->ۙ(Ll/֫֨ۗ;)V

    .line 125
    iget-object v2, p0, Ll/ܿ֨ۗ;->᩶:Ll/ۧ֨ۗ;

    if-eqz v2, :cond_0

    .line 126
    invoke-virtual {v2, v0}, Ll/ۧ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    .line 254
    :cond_0
    invoke-virtual {v1}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    const/4 v0, 0x0

    .line 255
    iput-object v0, p0, Ll/ܿ֨ۗ;->᩶:Ll/ۧ֨ۗ;

    return-void
.end method

.method public final ᩴ()Ll/ۧ֨ۗ;
    .locals 3

    .line 235
    iget-object v0, p0, Ll/ܿ֨ۗ;->᩶:Ll/ۧ֨ۗ;

    if-eqz v0, :cond_0

    return-object v0

    .line 236
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Code variable not set in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 236
    throw v0
.end method

.method public final ᩵()Ljava/util/ArrayList;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܿ֨ۗ;->۟:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩶()Z
    .locals 1

    .line 210
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷(Ll/֫֨ۗ;)V
    .locals 4

    .line 112
    invoke-virtual {p0}, Ll/ܿ֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 113
    invoke-virtual {v0, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 114
    :cond_0
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can\'t change immutable type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 114
    throw v1

    .line 124
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܿ֨ۗ;->֡:Ll/᩸۫᩵;

    invoke-virtual {v0, p1}, Ll/᩸۫᩵;->ۙ(Ll/֫֨ۗ;)V

    .line 125
    iget-object v0, p0, Ll/ܿ֨ۗ;->᩶:Ll/ۧ֨ۗ;

    if-eqz v0, :cond_2

    .line 126
    invoke-virtual {v0, p1}, Ll/ۧ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    :cond_2
    return-void
.end method

.method public final ᩷(Ll/ۛ֨ۗ;)V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    if-nez v0, :cond_0

    .line 73
    iput-object p1, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    return-void

    :cond_0
    if-eq v0, p1, :cond_1

    .line 75
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ۗۙ()V

    .line 76
    iput-object p1, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    :cond_1
    return-void
.end method

.method public final ᩷(Ll/ᩳۢۗ;)V
    .locals 3

    .line 150
    iget-object v0, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 151
    new-instance v1, Ll/᩺֨ۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ll/᩺֨ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 152
    iget-object p1, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 153
    iput-object p1, p0, Ll/ܿ֨ۗ;->ᩳ:Ljava/util/ArrayList;

    :cond_0
    return-void
.end method

.method public final ᩸()Ll/ᩳۡۗ;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    .line 92
    iget-object v0, v0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    return-object v0
.end method

.method public final ᩹()I
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ܿ֨ۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ᩺()Z
    .locals 2

    .line 67
    iget-object v0, p0, Ll/ܿ֨ۗ;->ܰ:Ll/ۛ֨ۗ;

    .line 92
    iget-object v0, v0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    if-eqz v0, :cond_0

    .line 206
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->۟ۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ܿ֨ۗ;->ܿ:I

    return v0
.end method
