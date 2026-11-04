.class public final Ll/᩻᩷᩵;
.super Ll/ܺ۠ۗ;
.source "B6EY"


# static fields
.field public static final synthetic ܰ:I

.field public static final ܿ:Ljava/util/EnumSet;

.field public static final ᩶:Ljava/util/EnumSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    .line 35
    sget-object v0, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    sget-object v1, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    sget-object v2, Ll/᩺ۢۗ;->۠ۙ:Ll/᩺ۢۗ;

    sget-object v3, Ll/᩺ۢۗ;->ۙ᩷:Ll/᩺ۢۗ;

    const/4 v4, 0x6

    new-array v5, v4, [Ll/᩺ۢۗ;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v7, 0x1

    aput-object v2, v5, v7

    sget-object v8, Ll/᩺ۢۗ;->ܶۙ:Ll/᩺ۢۗ;

    const/4 v9, 0x2

    aput-object v8, v5, v9

    sget-object v8, Ll/᩺ۢۗ;->᩹ۙ:Ll/᩺ۢۗ;

    const/4 v10, 0x3

    aput-object v8, v5, v10

    const/4 v8, 0x4

    aput-object v3, v5, v8

    sget-object v11, Ll/᩺ۢۗ;->᩵ۙ:Ll/᩺ۢۗ;

    const/4 v12, 0x5

    aput-object v11, v5, v12

    invoke-static {v0, v5}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v5

    sput-object v5, Ll/᩻᩷᩵;->᩶:Ljava/util/EnumSet;

    new-array v4, v4, [Ll/᩺ۢۗ;

    aput-object v3, v4, v6

    .line 51
    sget-object v3, Ll/᩺ۢۗ;->ܳۙ:Ll/᩺ۢۗ;

    aput-object v3, v4, v7

    aput-object v1, v4, v9

    aput-object v2, v4, v10

    sget-object v1, Ll/᩺ۢۗ;->ܺۙ:Ll/᩺ۢۗ;

    aput-object v1, v4, v8

    sget-object v1, Ll/᩺ۢۗ;->ܽۙ:Ll/᩺ۢۗ;

    aput-object v1, v4, v12

    invoke-static {v0, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ll/᩻᩷᩵;->ܿ:Ljava/util/EnumSet;

    return-void
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5

    .line 217
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 219
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۡۗ;

    .line 220
    invoke-virtual {v3}, Ll/᩷ۡۗ;->᩻ۙ()I

    move-result v4

    invoke-static {p0, v4}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v4

    .line 221
    invoke-static {v3, v4}, Ll/᩻᩷᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 222
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 225
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۡۗ;

    .line 226
    invoke-static {p1, v1}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/HashMap;)Ll/᩷ۡۗ;

    move-result-object v2

    .line 227
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 228
    invoke-static {v4, v1}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/HashMap;)Ll/᩷ۡۗ;

    move-result-object v4

    .line 229
    invoke-static {v2, v4}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_2

    .line 231
    :cond_2
    sget-object v3, Ll/ۧ۟ۗ;->۬:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p1

    check-cast p1, Ll/ܰᩳۗ;

    if-eqz p1, :cond_1

    .line 233
    new-instance v3, Ll/ܰᩳۗ;

    invoke-virtual {p1}, Ll/ܰᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object p1

    invoke-static {p1, v1}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ljava/util/HashMap;)Ll/᩷ۡۗ;

    move-result-object p1

    invoke-direct {v3, p1}, Ll/ܰᩳۗ;-><init>(Ll/᩷ۡۗ;)V

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public static ۙ(ILjava/util/HashMap;)Ll/᩷ۡۗ;
    .locals 1

    .line 343
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۡۗ;

    if-eqz p1, :cond_0

    return-object p1

    .line 345
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Missing block: "

    .line 0
    invoke-static {p0, v0}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 345
    throw p1
.end method

.method public static ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;
    .locals 3

    .line 150
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    .line 151
    new-instance v1, Ll/᩷ۡۗ;

    invoke-virtual {p0}, Ll/ۖۡۗ;->᩶ۙ()I

    move-result p0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, p0, v2, p1}, Ll/᩷ۡۗ;-><init>(III)V

    .line 152
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)Ll/᩷ۡۗ;
    .locals 1

    .line 184
    invoke-virtual {p2}, Ll/᩷ۡۗ;->᩻ۙ()I

    move-result v0

    invoke-static {p0, v0}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object p0

    .line 185
    sget-object v0, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 186
    invoke-static {p1, p2}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 187
    invoke-static {p1, p0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 188
    invoke-static {p0, p2}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 189
    invoke-static {p1, p2, p0}, Ll/᩻᩷᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 190
    invoke-virtual {p1}, Ll/᩷ۡۗ;->᩹ۙ()V

    .line 191
    invoke-virtual {p0}, Ll/᩷ۡۗ;->᩹ۙ()V

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ljava/util/HashMap;)Ll/᩷ۡۗ;
    .locals 2

    .line 240
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ۡۗ;

    if-eqz p1, :cond_0

    return-object p1

    .line 242
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Copy blocks tree failed. Missing block for connection: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 242
    throw p1
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Ll/᩷ۡۗ;
    .locals 2

    .line 196
    invoke-virtual {p0}, Ll/᩷ۡۗ;->᩻ۙ()I

    move-result v0

    invoke-static {p1, v0}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object p1

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 198
    invoke-static {v1, p0, p1}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 199
    invoke-virtual {v1}, Ll/᩷ۡۗ;->᩹ۙ()V

    goto :goto_0

    .line 201
    :cond_0
    invoke-static {p1, p0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 202
    invoke-virtual {p1}, Ll/᩷ۡۗ;->᩹ۙ()V

    return-object p1
.end method

.method public static ۙ(Ll/᩷ۡۗ;)V
    .locals 3

    .line 466
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 467
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 468
    invoke-virtual {v1}, Ll/᩷ۡۗ;->᩹ۙ()V

    goto :goto_0

    .line 470
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 471
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 473
    :cond_1
    sget-object v0, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 474
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 475
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 1

    .line 157
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 158
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    :cond_0
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 161
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 0

    .line 178
    invoke-static {p0, p1}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 179
    invoke-static {p0, p2}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 180
    invoke-static {p0, p1, p2}, Ll/᩻᩷᩵;->᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    return-void
.end method

.method public static ۙ(Ll/᩺ۢۗ;)Z
    .locals 1

    .line 45
    sget-object v0, Ll/᩻᩷᩵;->᩶:Ljava/util/EnumSet;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ۤ(Ll/᩷ۡۗ;)V
    .locals 2

    .line 171
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۡۗ;

    .line 172
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 174
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public static ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 1

    .line 166
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 167
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;)V
    .locals 2

    .line 399
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

    .line 400
    sget-object v1, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 401
    invoke-static {v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 4

    .line 207
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 208
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۡۗ;

    .line 209
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ۚۙ()Ll/ᩳۡۗ;

    move-result-object v2

    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 211
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 213
    sget-object p0, Ll/ۧ۟ۗ;->۬:Ll/ۧ۟ۗ;

    invoke-virtual {p1, p0}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    return-void
.end method

.method public static ᩷(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V
    .locals 1

    .line 248
    sget-object v0, Ll/ۧ۟ۗ;->۬:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ܰᩳۗ;

    if-eqz v0, :cond_0

    .line 249
    invoke-virtual {v0}, Ll/ܰᩳۗ;->ۙ()Ll/᩷ۡۗ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 250
    new-instance v0, Ll/ܰᩳۗ;

    invoke-direct {v0, p2}, Ll/ܰᩳۗ;-><init>(Ll/᩷ۡۗ;)V

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 252
    :cond_0
    invoke-static {p0}, Ll/᩹֫᩵;->᩷(Ll/᩹ۡۗ;)Ll/ᩳۡۗ;

    move-result-object p0

    .line 253
    instance-of v0, p0, Ll/ۡۢۗ;

    if-eqz v0, :cond_1

    .line 254
    check-cast p0, Ll/ۡۢۗ;

    invoke-virtual {p0, p1, p2}, Ll/ۡۢۗ;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    :cond_1
    return-void
.end method

.method public static ᩷(Ll/᩷ۡۗ;)Z
    .locals 4

    .line 440
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 441
    invoke-virtual {p0}, Ll/ܺ۟ۗ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 442
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_1

    .line 443
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/֫۟ۗ;->ᩳۙ:Ll/֫۟ۗ;

    .line 444
    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Ll/֫۟ۗ;->ۢۙ:Ll/֫۟ۗ;

    .line 445
    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 446
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 416
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_0

    .line 417
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷ۡۗ;

    .line 418
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v1

    new-instance v3, Ll/۫᩷᩵;

    invoke-direct {v3, p0, v0}, Ll/۫᩷᩵;-><init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    invoke-static {v1, v3}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 424
    invoke-static {p0, v0}, Ll/᩻᩷᩵;->ۤ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_0

    .line 426
    :cond_0
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll/ۚ᩷᩵;

    const/4 v3, 0x0

    invoke-direct {v1, v3, p0}, Ll/ۚ᩷᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 431
    :goto_0
    sget-object v0, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 432
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 433
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    return v2

    :cond_1
    return v1
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 13

    .line 62
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 65
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ᩴ᩷()V

    const/4 v0, -0x1

    .line 88
    invoke-static {p1, v0}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v1

    .line 89
    sget-object v2, Ll/֫۟ۗ;->ᩳۙ:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 90
    invoke-virtual {p1, v1}, Ll/ۖۡۗ;->᩸(Ll/᩷ۡۗ;)V

    .line 92
    invoke-static {p1, v0}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v0

    .line 93
    sget-object v2, Ll/֫۟ۗ;->ۢۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 94
    invoke-virtual {p1, v0}, Ll/ۖۡۗ;->ᩴ(Ll/᩷ۡۗ;)V

    .line 96
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 99
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    sget-object v7, Ll/ۧ۟ۗ;->᩺:Ll/ۧ۟ۗ;

    if-ge v6, v3, :cond_c

    aget-object v8, v2, v6

    if-nez v8, :cond_1

    goto/16 :goto_4

    .line 103
    :cond_1
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v9

    sget-object v10, Ll/᩺ۢۗ;->᩶ۙ:Ll/᩺ۢۗ;

    if-ne v9, v10, :cond_2

    invoke-virtual {v8}, Ll/ܺ۟ۗ;->ۢ()Z

    move-result v9

    if-eqz v9, :cond_2

    goto/16 :goto_4

    .line 106
    :cond_2
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getOffset()I

    move-result v9

    if-nez v5, :cond_4

    .line 144
    :cond_3
    :goto_1
    invoke-static {p1, v9}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v5

    .line 145
    invoke-static {v1, v5}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    move-object v1, v5

    goto/16 :goto_3

    .line 111
    :cond_4
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    .line 112
    sget-object v11, Ll/᩻᩷᩵;->ܿ:Ljava/util/EnumSet;

    invoke-interface {v11, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 113
    invoke-static {p1, v9}, Ll/᩻᩷᩵;->ۙ(Ll/ۖۡۗ;I)Ll/᩷ۡۗ;

    move-result-object v1

    goto/16 :goto_3

    .line 45
    :cond_5
    sget-object v11, Ll/᩻᩷᩵;->᩶:Ljava/util/EnumSet;

    invoke-interface {v11, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    .line 115
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v10

    .line 45
    invoke-interface {v11, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    .line 115
    sget-object v10, Ll/֫۟ۗ;->ܺ᩷:Ll/֫۟ۗ;

    .line 116
    invoke-virtual {v8, v10}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v10

    if-nez v10, :cond_3

    sget-object v10, Ll/֫۟ۗ;->ܽ᩷:Ll/֫۟ۗ;

    .line 117
    invoke-virtual {v5, v10}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v10

    if-nez v10, :cond_3

    sget-object v10, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    .line 118
    invoke-virtual {v8, v10}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v10

    if-nez v10, :cond_3

    .line 317
    invoke-virtual {v5, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v10

    .line 318
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_7

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۫ᩳۗ;

    .line 319
    invoke-virtual {v11}, Ll/۫ᩳۗ;->᩷()I

    move-result v11

    invoke-virtual {v5}, Ll/ᩳۡۗ;->getOffset()I

    move-result v12

    if-ne v11, v12, :cond_6

    goto :goto_2

    .line 323
    :cond_7
    invoke-virtual {v8, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v5

    .line 324
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۫ᩳۗ;

    .line 325
    invoke-virtual {v7}, Ll/۫ᩳۗ;->ۙ()I

    move-result v7

    invoke-virtual {v8}, Ll/ᩳۡۗ;->getOffset()I

    move-result v10

    if-ne v7, v10, :cond_8

    goto :goto_2

    .line 334
    :cond_9
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v7, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    if-eq v5, v7, :cond_a

    goto :goto_3

    .line 337
    :cond_a
    move-object v5, v8

    check-cast v5, Ll/ܽۢۗ;

    .line 338
    invoke-virtual {v5}, Ll/ܽۢۗ;->᩵ۙ()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷ۡۗ;

    if-ne v5, v1, :cond_b

    :goto_2
    goto/16 :goto_1

    .line 124
    :cond_b
    :goto_3
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    invoke-virtual {v1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v5, v8

    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 259
    :cond_c
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 260
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 261
    invoke-virtual {v3, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v3

    .line 262
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۫ᩳۗ;

    .line 263
    invoke-virtual {v5}, Ll/۫ᩳۗ;->᩷()I

    move-result v6

    invoke-static {v6, v0}, Ll/᩻᩷᩵;->ۙ(ILjava/util/HashMap;)Ll/᩷ۡۗ;

    move-result-object v6

    .line 264
    invoke-virtual {v5}, Ll/۫ᩳۗ;->ۙ()I

    move-result v5

    invoke-static {v5, v0}, Ll/᩻᩷᩵;->ۙ(ILjava/util/HashMap;)Ll/᩷ۡۗ;

    move-result-object v5

    .line 265
    invoke-static {v6, v5}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    goto :goto_5

    .line 135
    :cond_f
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/ۧ᩷᩵;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v2}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 351
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 352
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    .line 353
    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v5, :cond_10

    .line 355
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ᩳۡۗ;

    .line 356
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v9

    sget-object v10, Ll/᩺ۢۗ;->ۨۙ:Ll/᩺ۢۗ;

    if-ne v9, v10, :cond_13

    .line 357
    invoke-virtual {v8}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    const/4 v9, 0x0

    :goto_7
    if-ge v9, v5, :cond_12

    .line 359
    new-instance v10, Ll/ᩳۡۗ;

    sget-object v11, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    invoke-direct {v10, v11, v3}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    mul-int/lit8 v11, v9, 0x2

    .line 361
    invoke-virtual {v8, v11}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v12

    check-cast v12, Ll/ۛ֨ۗ;

    invoke-virtual {v10, v12}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    add-int/2addr v11, v3

    .line 362
    invoke-virtual {v8, v11}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v11

    invoke-virtual {v10, v11}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 430
    invoke-virtual {v10, v8}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {v10, v8}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    if-nez v9, :cond_11

    .line 365
    invoke-virtual {v8}, Ll/ᩳۡۗ;->getOffset()I

    move-result v11

    invoke-virtual {v10, v11}, Ll/ᩳۡۗ;->ܳ(I)V

    .line 366
    invoke-virtual {v2, v6, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_11
    add-int v11, v6, v9

    .line 368
    invoke-virtual {v2, v11, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_12
    add-int/lit8 v5, v5, -0x1

    add-int/2addr v6, v5

    .line 372
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    :cond_13
    add-int/2addr v6, v3

    goto :goto_6

    .line 71
    :cond_14
    sget-object v1, Ll/֫۟ۗ;->ۤ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_17

    .line 24
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    .line 38
    :goto_9
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v5

    .line 39
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    .line 40
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    .line 41
    sget-object v9, Ll/᩺ۢۗ;->ܽۙ:Ll/᩺ۢۗ;

    invoke-static {v8, v9}, Ll/᩹֫᩵;->ۙ(Ll/᩹ۡۗ;Ll/᩺ۢۗ;)Z

    move-result v9

    if-eqz v9, :cond_15

    .line 52
    new-instance v9, Ll/᩵᩷᩵;

    invoke-direct {v9, v8, p1}, Ll/᩵᩷᩵;-><init>(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    invoke-static {p1, v8, v9}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/᩷ۡۗ;Ljava/util/function/Predicate;)V

    .line 43
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-eq v6, v8, :cond_15

    add-int/lit8 v5, v2, 0x1

    if-gt v2, v1, :cond_16

    move v2, v5

    goto :goto_9

    .line 32
    :cond_16
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Fail to resolve jsr instructions"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 32
    throw p1

    .line 379
    :cond_17
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 380
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 381
    invoke-virtual {v5, v7}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    goto :goto_a

    .line 387
    :cond_19
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 388
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    new-instance v5, Ll/ۖۛۧ;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Ll/ۖۛۧ;-><init>(I)V

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    goto :goto_b

    .line 407
    :cond_1a
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/᩹ۚ֫;

    const/4 v5, 0x3

    invoke-direct {v2, v5}, Ll/᩹ۚ֫;-><init>(I)V

    invoke-static {v1, v2}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 78
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ll/֫᩷᩵;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v2}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    .line 277
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩻᩷()Z

    move-result v1

    if-eqz v1, :cond_1b

    goto/16 :goto_f

    .line 280
    :cond_1b
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 281
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1d
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۡۗ;

    .line 282
    sget-object v7, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v6

    check-cast v6, Ll/᩷۠ۗ;

    if-nez v6, :cond_1e

    goto :goto_c

    .line 286
    :cond_1e
    invoke-virtual {v6}, Ll/᩷۠ۗ;->᩷()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1f
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ᩴ۠ۗ;

    .line 287
    invoke-virtual {v7}, Ll/ᩴ۠ۗ;->۫()I

    move-result v7

    invoke-static {v7, v0}, Ll/᩻᩷᩵;->ۙ(ILjava/util/HashMap;)Ll/᩷ۡۗ;

    move-result-object v7

    .line 288
    sget-object v8, Ll/ۧ۟ۗ;->ۤۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v7, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v8

    if-nez v8, :cond_1f

    .line 289
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۧۙ()Ljava/util/List;

    move-result-object v8

    .line 290
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_21

    .line 293
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-ne v9, v3, :cond_20

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩷ۡۗ;

    goto :goto_e

    :cond_20
    move-object v8, v2

    .line 294
    :goto_e
    invoke-virtual {v8}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1f

    .line 295
    invoke-static {v8, v7}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 296
    new-instance v9, Ll/۟ᩳۗ;

    invoke-direct {v9, v8}, Ll/۟ᩳۗ;-><init>(Ll/᩷ۡۗ;)V

    invoke-virtual {v7, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    goto :goto_d

    .line 291
    :cond_21
    new-instance p1, Ll/۠ۧ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected missing predecessor for block: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 291
    throw p1

    .line 305
    :cond_22
    :goto_f
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۗۙ()Ll/᩷ۡۗ;

    move-result-object v0

    .line 306
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_23
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 307
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_23

    if-eq v2, v0, :cond_23

    .line 308
    invoke-static {v2, v0}, Ll/᩻᩷᩵;->ۙ(Ll/᩷ۡۗ;Ll/᩷ۡۗ;)V

    .line 309
    sget-object v3, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    invoke-static {v2, v3}, Ll/᩹֫᩵;->ۙ(Ll/᩹ۡۗ;Ll/᩺ۢۗ;)Z

    move-result v3

    if-eqz v3, :cond_23

    .line 310
    sget-object v3, Ll/֫۟ۗ;->ᩴ᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_10

    .line 83
    :cond_24
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۛ᩷()V

    .line 84
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۨ᩷()V

    return-void
.end method
