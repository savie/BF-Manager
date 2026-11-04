.class public final Ll/ۨۚ᩵;
.super Ll/ܺ۠ۗ;
.source "76HC"


# static fields
.field public static final synthetic ܰ:I

.field public static final ᩶:Ll/᩻ܽ᩺;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 49
    const-class v0, Ll/ۨۚ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ۨۚ᩵;->᩶:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ll/ۜ᩶ۗ;Ll/ۖۡۗ;Ll/֫ۖۗ;Ll/᩹ۚ᩵;)V
    .locals 1

    .line 128
    :try_start_0
    invoke-static {p0, p1, p2, p3}, Ll/ۨۚ᩵;->᩷(Ll/ۜ᩶ۗ;Ll/ۖۡۗ;Ll/֫ۖۗ;Ll/᩹ۚ᩵;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 130
    new-instance p2, Ll/۠ۧ᩵;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Usage info collection failed with error: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " at insn: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 15
    invoke-direct {p2, p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    throw p2
.end method

.method public static ۙ(Ll/᩵ۡۗ;Ll/ۗ᩶ۗ;Ll/᩹ۚ᩵;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 211
    invoke-virtual {p1}, Ll/ۗ᩶ۗ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 214
    :cond_0
    invoke-virtual {p1}, Ll/ۗ᩶ۗ;->᩷()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩶ۗ;

    .line 215
    invoke-static {p0, v0, p2}, Ll/ۨۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/۫᩶ۗ;Ll/᩹ۚ᩵;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/᩵ۡۗ;Ll/۫᩶ۗ;Ll/᩹ۚ᩵;)V
    .locals 1

    .line 220
    invoke-interface {p1}, Ll/۫᩶ۗ;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫֨ۗ;->ۤ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, Ll/᩹ۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/֫֨ۗ;)V

    .line 221
    invoke-interface {p1}, Ll/۫᩶ۗ;->᩷()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۗ;

    .line 222
    invoke-static {p0, v0, p2}, Ll/ۨۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/ܳ᩶ۗ;Ll/᩹ۚ᩵;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/᩵ۡۗ;Ll/ܳ᩶ۗ;Ll/᩹ۚ᩵;)V
    .locals 2

    .line 228
    invoke-virtual {p1}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v0

    .line 229
    sget-object v1, Ll/᩵ۚ᩵;->ۙ:[I

    invoke-virtual {p1}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_6

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    const/4 v1, 0x5

    if-eq p1, v1, :cond_0

    goto :goto_1

    .line 249
    :cond_0
    check-cast v0, Ll/۫᩶ۗ;

    invoke-static {p0, v0, p2}, Ll/ۨۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/۫᩶ۗ;Ll/᩹ۚ᩵;)V

    return-void

    .line 244
    :cond_1
    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۗ;

    .line 245
    invoke-static {p0, v0, p2}, Ll/ۨۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/ܳ᩶ۗ;Ll/᩹ۚ᩵;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    .line 235
    :cond_3
    instance-of p1, v0, Ll/֨ܰۗ;

    if-eqz p1, :cond_4

    .line 236
    invoke-interface {p0}, Ll/᩺ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object p1

    check-cast v0, Ll/֨ܰۗ;

    invoke-static {p1, v0}, Ll/۬ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ܰۗ;)Ll/۬ᩳۗ;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Ll/᩹ۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/۬ᩳۗ;)V

    return-void

    .line 237
    :cond_4
    instance-of p1, v0, Ll/۬ᩳۗ;

    if-eqz p1, :cond_5

    .line 238
    check-cast v0, Ll/۬ᩳۗ;

    invoke-virtual {p2, p0, v0}, Ll/᩹ۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/۬ᩳۗ;)V

    return-void

    .line 240
    :cond_5
    new-instance p0, Ll/۠ۧ᩵;

    const-string p1, "Unexpected field type class: "

    const-class p2, Ll/ܳ᩶ۗ;

    .line 0
    invoke-static {p2, p1}, Ll/᩻ۢ᩹;->ۙ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 240
    throw p0

    .line 231
    :cond_6
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ll/֫֨ۗ;->ۤ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Ll/᩹ۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/֫֨ۗ;)V

    return-void
.end method

.method public static ۙ(Ll/᩺ܿۗ;)V
    .locals 4

    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 70
    check-cast p0, Ll/᩹ۚ᩵;

    invoke-virtual {p0}, Ll/᩹ۚ᩵;->ۙ()V

    .line 71
    sget-object p0, Ll/ۨۚ᩵;->᩶:Ll/᩻ܽ᩺;

    invoke-interface {p0}, Ll/᩻ܽ᩺;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Apply usage data in {}ms"

    invoke-interface {p0, v0, v1}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static ᩷(Ll/ۜ᩶ۗ;Ll/ۖۡۗ;Ll/֫ۖۗ;Ll/᩹ۚ᩵;)V
    .locals 4

    .line 137
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ۤ()Ll/ۙܿۗ;

    move-result-object v0

    sget-object v1, Ll/ۙܿۗ;->ۙᩴ:Ll/ۙܿۗ;

    if-ne v0, v1, :cond_0

    goto/16 :goto_3

    .line 140
    :cond_0
    sget-object v0, Ll/᩵ۚ᩵;->᩷:[I

    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܺ()Ll/۬᩶ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_c

    const/4 v1, 0x2

    if-eq v0, v1, :cond_a

    const/4 v1, 0x3

    if-eq v0, v1, :cond_7

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    goto/16 :goto_3

    .line 175
    :cond_1
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܽ()V

    .line 20
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܺ()Ll/۬᩶ۗ;

    move-result-object v0

    sget-object v2, Ll/۬᩶ۗ;->᩶:Ll/۬᩶ۗ;

    const/4 v3, 0x0

    if-eq v0, v2, :cond_2

    move-object v0, v3

    goto :goto_0

    .line 23
    :cond_2
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->᩻()Ll/ۤܿۗ;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 25
    check-cast v0, Ll/۟ܰۗ;

    goto :goto_0

    .line 27
    :cond_3
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ۧ()Ll/֡᩶ۗ;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_4

    goto :goto_1

    .line 47
    :cond_4
    invoke-interface {v0}, Ll/۟ܰۗ;->᩷()Ljava/util/List;

    move-result-object p0

    .line 48
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 49
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳ᩶ۗ;

    .line 50
    invoke-virtual {p0}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object v0

    sget-object v1, Ll/᩸᩶ۗ;->ۙۙ:Ll/᩸᩶ۗ;

    if-ne v0, v1, :cond_5

    .line 51
    invoke-virtual {p0}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ll/۠ܰۗ;

    :cond_5
    :goto_1
    if-eqz v3, :cond_b

    .line 179
    invoke-interface {v3}, Ll/۠ܰۗ;->ۤ()Ll/۬ܰۗ;

    move-result-object p0

    if-eqz p0, :cond_b

    .line 181
    invoke-static {p2, p0}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/۬ܰۗ;)Ll/᩷ۢۗ;

    move-result-object p0

    .line 182
    invoke-virtual {p2, p0}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 184
    invoke-virtual {p3, p1, p2}, Ll/᩹ۚ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۖۡۗ;)V

    return-void

    .line 186
    :cond_6
    invoke-virtual {p3, p1, p0}, Ll/᩹ۚ᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۢۗ;)V

    return-void

    .line 156
    :cond_7
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܽ()V

    .line 158
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->᩻()Ll/ۤܿۗ;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 160
    check-cast v0, Ll/۬ܰۗ;

    goto :goto_2

    .line 162
    :cond_8
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->۫()Ll/᩵ܺ᩵;

    move-result-object v0

    .line 164
    :goto_2
    invoke-static {p2, v0}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/۬ܰۗ;)Ll/᩷ۢۗ;

    move-result-object p0

    .line 165
    invoke-virtual {p2, p0}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object p2

    if-eqz p2, :cond_9

    .line 167
    invoke-virtual {p3, p1, p2}, Ll/᩹ۚ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۖۡۗ;)V

    return-void

    .line 169
    :cond_9
    invoke-virtual {p3, p1, p0}, Ll/᩹ۚ᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۢۗ;)V

    return-void

    .line 148
    :cond_a
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܽ()V

    .line 149
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ۚ()Ll/ܺܺ᩵;

    move-result-object p0

    invoke-static {p2, p0}, Ll/۬ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ܰۗ;)Ll/۬ᩳۗ;

    move-result-object p0

    invoke-virtual {p2, p0}, Ll/֫ۖۗ;->ۙ(Ll/۬ᩳۗ;)Ll/ܽۡۗ;

    move-result-object p0

    if-eqz p0, :cond_b

    .line 151
    invoke-virtual {p3, p1, p0}, Ll/᩹ۚ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܽۡۗ;)V

    :cond_b
    :goto_3
    return-void

    .line 142
    :cond_c
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܽ()V

    .line 143
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܳ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/֫֨ۗ;->ۤ(Ljava/lang/String;)Ll/֫֨ۗ;

    move-result-object p0

    .line 144
    invoke-virtual {p3, p1, p0}, Ll/᩹ۚ᩵;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)V

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "UsageInfoVisitor"

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 9

    .line 53
    invoke-virtual {p1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۘۗ;->᩶()Ll/ۘܿۗ;

    move-result-object v0

    .line 54
    invoke-virtual {v0, p1}, Ll/ۘܿۗ;->ۙ(Ll/֫ۖۗ;)Ll/᩺ܿۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 57
    :try_start_0
    invoke-static {v1}, Ll/ۨۚ᩵;->ۙ(Ll/᩺ܿۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 60
    sget-object v2, Ll/ۨۚ᩵;->᩶:Ll/᩻ܽ᩺;

    const-string v3, "Failed to apply cached usage data"

    invoke-interface {v2, v3, v1}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    :cond_0
    new-instance v1, Ll/᩹ۚ᩵;

    invoke-direct {v1, p1}, Ll/᩹ۚ᩵;-><init>(Ll/֫ۖۗ;)V

    .line 78
    invoke-virtual {p1}, Ll/֫ۖۗ;->ۜ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۡۗ;

    .line 85
    invoke-virtual {v3}, Ll/᩻ۡۗ;->۟ۙ()Ll/֫֨ۗ;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ll/᩹ۚ᩵;->ۙ(Ll/᩻ۡۗ;Ll/֫֨ۗ;)V

    .line 86
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫֨ۗ;

    .line 87
    invoke-virtual {v1, v3, v5}, Ll/᩹ۚ᩵;->ۙ(Ll/᩻ۡۗ;Ll/֫֨ۗ;)V

    goto :goto_0

    .line 89
    :cond_2
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/֫֨ۗ;

    .line 90
    invoke-virtual {v1, v3, v5}, Ll/᩹ۚ᩵;->ۙ(Ll/᩻ۡۗ;Ll/֫֨ۗ;)V

    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {v3}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    sget-object v6, Ll/᩻᩶ۗ;->ۤ:Ll/᩻᩶ۗ;

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܽۡۗ;

    .line 93
    invoke-virtual {v5}, Ll/ܽۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v7

    invoke-virtual {v1, v3, v7}, Ll/᩹ۚ᩵;->ۙ(Ll/᩻ۡۗ;Ll/֫֨ۗ;)V

    .line 196
    invoke-virtual {v5, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v6

    check-cast v6, Ll/ۗ᩶ۗ;

    .line 197
    invoke-static {v5, v6, v1}, Ll/ۨۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/ۗ᩶ۗ;Ll/᩹ۚ᩵;)V

    goto :goto_2

    .line 196
    :cond_4
    invoke-virtual {v3, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/ۗ᩶ۗ;

    .line 197
    invoke-static {v3, v4, v1}, Ll/ۨۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/ۗ᩶ۗ;Ll/᩹ۚ᩵;)V

    .line 98
    invoke-virtual {v3}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖۡۗ;

    .line 196
    invoke-virtual {v4, v6}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/ۗ᩶ۗ;

    .line 197
    invoke-static {v4, v5, v1}, Ll/ۨۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/ۗ᩶ۗ;Ll/᩹ۚ᩵;)V

    .line 202
    sget-object v5, Ll/᩻᩶ۗ;->᩸:Ll/᩻᩶ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/᩹᩶ۗ;

    if-eqz v5, :cond_5

    .line 204
    invoke-virtual {v5}, Ll/᩹᩶ۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩶ۗ;

    .line 205
    invoke-static {v4, v7, v1}, Ll/ۨۚ᩵;->ۙ(Ll/᩵ۡۗ;Ll/ۗ᩶ۗ;Ll/᩹ۚ᩵;)V

    goto :goto_4

    .line 105
    :cond_5
    invoke-virtual {v4}, Ll/ۖۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Ll/᩹ۚ᩵;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)V

    .line 106
    invoke-virtual {v4}, Ll/ۖۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫֨ۗ;

    .line 107
    invoke-virtual {v1, v4, v7}, Ll/᩹ۚ᩵;->ۙ(Ll/ۖۡۗ;Ll/֫֨ۗ;)V

    goto :goto_5

    .line 118
    :cond_6
    :try_start_1
    invoke-virtual {v4}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_3

    .line 121
    :cond_7
    invoke-virtual {v4}, Ll/ۖۡۗ;->ۧۙ()Ll/᩻ܺ᩵;

    move-result-object v5

    if-nez v5, :cond_8

    goto :goto_3

    .line 125
    :cond_8
    invoke-virtual {v4}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v7

    .line 126
    new-instance v8, Ll/ۗۚ᩵;

    invoke-direct {v8, v7, v4, v1}, Ll/ۗۚ᩵;-><init>(Ll/֫ۖۗ;Ll/ۖۡۗ;Ll/᩹ۚ᩵;)V

    invoke-virtual {v5, v8}, Ll/᩻ܺ᩵;->ۙ(Ljava/util/function/Consumer;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v5

    const-string v7, "Dependency scan failed"

    .line 19
    invoke-static {v4, v7, v5}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    .line 64
    :cond_9
    invoke-virtual {v0, p1, v1}, Ll/ۘܿۗ;->ۙ(Ll/֫ۖۗ;Ll/᩹ۚ᩵;)V

    .line 65
    invoke-static {v1}, Ll/ۨۚ᩵;->ۙ(Ll/᩺ܿۗ;)V

    return-void
.end method
