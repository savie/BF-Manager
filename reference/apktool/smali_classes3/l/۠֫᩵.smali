.class public final Ll/۠֫᩵;
.super Ljava/lang/Object;
.source "4IX4"


# static fields
.field public static final synthetic ۙ:I

.field public static final ᩷:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    const-class v0, Ll/۠֫᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/۠֫᩵;->᩷:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/ܺ֨ۗ;)Ljava/lang/Object;
    .locals 2

    .line 163
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p1, Ll/᩹֨ۗ;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, Ll/ۛ֨ۗ;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 167
    check-cast p1, Ll/ۛ֨ۗ;

    .line 168
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    .line 172
    :cond_1
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    .line 173
    invoke-virtual {p1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    invoke-static {p0, p1}, Ll/۠֫᩵;->ۙ(Ll/֫ۖۗ;Ll/ܺ֨ۗ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 175
    :cond_2
    invoke-static {p0, p1}, Ll/۠֫᩵;->ۙ(Ll/֫ۖۗ;Ll/ᩳۡۗ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 0
    :cond_3
    instance-of v0, p1, Ll/ܽ֨ۗ;

    if-eqz v0, :cond_4

    .line 178
    check-cast p1, Ll/ܽ֨ۗ;

    invoke-virtual {p1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p1

    .line 179
    invoke-static {p0, p1}, Ll/۠֫᩵;->ۙ(Ll/֫ۖۗ;Ll/ᩳۡۗ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v1
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/ᩳۡۗ;)Ljava/lang/Object;
    .locals 3

    .line 191
    sget-object v0, Ll/ۖ֫᩵;->ۙ:[I

    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return-object v2

    .line 199
    :cond_0
    check-cast p1, Ll/ۗۢۗ;

    invoke-virtual {p1}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ᩳۗ;

    .line 200
    invoke-virtual {p0, p1}, Ll/֫ۖۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object p0

    if-nez p0, :cond_1

    .line 202
    sget-object p0, Ll/۠֫᩵;->᩷:Ll/᩻ܽ᩺;

    const-string v0, "Field {} not found"

    invoke-interface {p0, p1, v0}, Ll/᩻ܽ᩺;->᩸(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    .line 205
    :cond_1
    sget-object p1, Ll/᩻᩶ۗ;->ᩴ:Ll/᩻᩶ۗ;

    invoke-virtual {p0, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p0

    check-cast p0, Ll/ܳ᩶ۗ;

    if-eqz p0, :cond_2

    .line 207
    invoke-static {p0}, Ll/ۛ֫᩵;->ۙ(Ll/ܳ᩶ۗ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v2

    .line 197
    :cond_3
    check-cast p1, Ll/۫ۢۗ;

    invoke-virtual {p1}, Ll/۫ۢۗ;->᩵ۙ()Ll/֫֨ۗ;

    move-result-object p0

    return-object p0

    .line 195
    :cond_4
    check-cast p1, Ll/ۚۢۗ;

    invoke-virtual {p1}, Ll/ۚۢۗ;->getString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    const/4 p0, 0x0

    .line 193
    invoke-virtual {p1, p0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(I)Ljava/lang/String;
    .locals 2

    if-gez p0, :cond_0

    const-string p0, "?"

    return-object p0

    .line 140
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "0x%04x"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, ""

    return-object p0

    .line 151
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x22

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 154
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩻ۡۗ;)Ll/ܶۘۗ;
    .locals 2

    move-object v0, p0

    .line 50
    :goto_0
    sget-object v1, Ll/ۧ۟ۗ;->ܳ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    check-cast v1, Ll/۟۟ۗ;

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 54
    :cond_0
    invoke-virtual {v0}, Ll/᩻ۡۗ;->᩶ۙ()Ll/᩻ۡۗ;

    move-result-object v1

    if-ne v1, v0, :cond_1

    .line 56
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۛۘۗ;->ۚ()Ll/ܶۘۗ;

    move-result-object p0

    return-object p0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public static ۙ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;
    .locals 2

    if-eqz p0, :cond_0

    .line 304
    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 305
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/ᩳۡۗ;
    .locals 4

    .line 123
    sget-object v0, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 126
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 127
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 128
    new-instance v2, Ll/֨֫᩵;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p1}, Ll/֨֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩺ۢۗ;Ljava/util/function/Predicate;)Ll/ᩳۡۗ;
    .locals 2

    .line 230
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 233
    :cond_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 234
    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 235
    invoke-static {v1, p1, p2}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;Ljava/util/function/Predicate;)Ll/ᩳۡۗ;

    move-result-object v1

    if-eqz v1, :cond_2

    return-object v1

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ܺ֨ۗ;)Ll/ᩳۡۗ;
    .locals 1

    if-eqz p0, :cond_0

    .line 0
    instance-of v0, p0, Ll/ܽ֨ۗ;

    if-eqz v0, :cond_0

    .line 325
    check-cast p0, Ll/ܽ֨ۗ;

    invoke-virtual {p0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Ll/ᩳۡۗ;
    .locals 1

    if-eqz p0, :cond_0

    .line 312
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;Ljava/util/function/Predicate;)Ll/ᩳۡۗ;
    .locals 2

    .line 287
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    invoke-interface {p2, p0}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 290
    :cond_0
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    .line 291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v0, Ll/ܽ֨ۗ;

    if-eqz v1, :cond_1

    .line 292
    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    .line 293
    invoke-static {v0, p1, p2}, Ll/۠֫᩵;->ۙ(Ll/ᩳۡۗ;Ll/᩺ۢۗ;Ljava/util/function/Predicate;)Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ۤۜۗ;)V
    .locals 4

    .line 260
    invoke-virtual {p1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 262
    invoke-virtual {p1, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    .line 263
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v3, v2, Ll/ܽ֨ۗ;

    if-eqz v3, :cond_0

    .line 264
    move-object v3, v2

    check-cast v3, Ll/ܽ֨ۗ;

    invoke-virtual {v3}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v3

    .line 265
    invoke-static {p0, v3, p2}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ۤۜۗ;)V

    .line 266
    invoke-virtual {p2, v3}, Ll/ۤۜۗ;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    if-eqz v3, :cond_0

    .line 268
    invoke-static {p0, v2}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    .line 269
    invoke-static {v3}, Ll/ܺ֨ۗ;->ۤ(Ll/ᩳۡۗ;)Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Ll/ᩳۡۗ;->ۙ(ILl/ܺ֨ۗ;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ۙ(Ljava/util/List;Ll/ۛ֨ۗ;)Z
    .locals 1

    if-eqz p0, :cond_3

    .line 355
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 358
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    if-eq v0, p1, :cond_2

    .line 359
    invoke-virtual {p1, v0}, Ll/ۛ֨ۗ;->᩷(Ll/ܺ֨ۗ;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/ۖۡۗ;)Z
    .locals 1

    .line 68
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object p0

    invoke-static {p0}, Ll/۠֫᩵;->ۙ(Ll/᩻ۡۗ;)Ll/ܶۘۗ;

    move-result-object p0

    sget-object v0, Ll/ܶۘۗ;->۟:Ll/ܶۘۗ;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܳۢۗ;)Z
    .locals 5

    .line 83
    invoke-static {p0}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 86
    :cond_0
    invoke-static {p0, p1}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/ᩳۡۗ;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 87
    invoke-static {p0, p1, v0}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_4

    .line 90
    :cond_1
    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-nez v1, :cond_2

    if-eq v0, p1, :cond_a

    goto :goto_3

    .line 94
    :cond_2
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩹()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_4

    .line 97
    :cond_3
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 98
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 99
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_4
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 101
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܿ֨ۗ;

    .line 102
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    .line 105
    :cond_5
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ֨ۗ;

    .line 106
    invoke-virtual {v3}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v3

    if-nez v3, :cond_7

    const/4 v3, 0x0

    goto :goto_2

    .line 107
    :cond_7
    invoke-static {p0, v3}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/ᩳۡۗ;

    move-result-object v3

    :goto_2
    if-eqz v3, :cond_a

    .line 108
    invoke-static {p0, p1, v3}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_4

    .line 112
    :cond_8
    invoke-virtual {v3}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 113
    invoke-virtual {v3}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_9
    :goto_3
    const/4 p0, 0x1

    return p0

    :cond_a
    :goto_4
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z
    .locals 1

    .line 73
    invoke-static {p0}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    sget-object p0, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    invoke-virtual {p2, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p0

    check-cast p0, Ll/᩷۠ۗ;

    .line 77
    new-instance p2, Ll/ۡ֫᩵;

    const/4 v0, 0x0

    invoke-direct {p2, v0, p0}, Ll/ۡ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, p2}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/ܺ֨ۗ;Ll/ۛ֨ۗ;)Z
    .locals 1

    .line 386
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p0, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    .line 387
    check-cast p0, Ll/ۛ֨ۗ;

    invoke-virtual {p0, p1}, Ll/ۛ֨ۗ;->᩷(Ll/ܺ֨ۗ;)Z

    move-result p0

    return p0

    .line 0
    :cond_0
    instance-of v0, p0, Ll/ܽ֨ۗ;

    if-eqz v0, :cond_5

    .line 390
    check-cast p0, Ll/ܽ֨ۗ;

    invoke-virtual {p0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_1

    .line 370
    :cond_1
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 371
    invoke-virtual {v0, p1}, Ll/ۛ֨ۗ;->᩷(Ll/ܺ֨ۗ;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 374
    :cond_2
    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 377
    :cond_3
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    .line 378
    invoke-static {v0, p1}, Ll/۠֫᩵;->ۙ(Ll/ܺ֨ۗ;Ll/ۛ֨ۗ;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩷(Ll/ᩳۡۗ;Ll/᩺ۢۗ;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 319
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object p0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩷(Ll/᩻ۡۗ;)Z
    .locals 1

    .line 795
    sget-object v0, Ll/ۧ۟ۗ;->ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-static {p0}, Ll/۠֫᩵;->ۙ(Ll/᩻ۡۗ;)Ll/ܶۘۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ܶۘۗ;->ۙ()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
