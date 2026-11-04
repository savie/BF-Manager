.class public final Ll/ۤ۫᩵;
.super Ll/ܺ۠ۗ;
.source "HIXW"


# instance fields
.field public ܰ:Ll/֫ۖۗ;

.field public ᩶:Ll/ۢ۫᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 53
    const-class v0, Ll/ۤ۫᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)V
    .locals 3

    .line 134
    invoke-virtual {p2}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v0

    .line 135
    invoke-virtual {v0}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v0

    .line 158
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۘۘܳ;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ll/ۘۘܳ;-><init>(I)V

    .line 159
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩷۬ۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩷۬ۗ;-><init>(I)V

    .line 160
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    iget-object v1, p0, Ll/ۤ۫᩵;->᩶:Ll/ۢ۫᩵;

    .line 161
    invoke-virtual {v1}, Ll/ۢ۫᩵;->ۙ()Ll/۠ܳ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ܳ᩵;->ۙ()Ljava/util/Comparator;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->max(Ljava/util/Comparator;)Ll/ܶۚۗ;

    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ll/ܶۚۗ;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 146
    :cond_0
    invoke-virtual {v0}, Ll/ܶۚۗ;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫֨ۗ;

    .line 147
    iget-object v1, p0, Ll/ۤ۫᩵;->᩶:Ll/ۢ۫᩵;

    invoke-virtual {v1, p1, p2, v0}, Ll/ۢ۫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;

    return-void
.end method

.method public static ۙ(Ll/ۤ۫᩵;Ll/ۖۡۗ;Ll/ܿ֨ۗ;)V
    .locals 2

    .line 125
    :try_start_0
    invoke-direct {p0, p1, p2}, Ll/ۤ۫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)V
    :try_end_0
    .catch Ll/ۖۧ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to calculate best type for var: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catch_1
    move-exception p0

    .line 127
    throw p0
.end method

.method public static ۙ(Ll/ۤ۫᩵;Ll/ܿ֨ۗ;)V
    .locals 9

    .line 165
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ܺ()Ll/᩸۫᩵;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 167
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    .line 196
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->᩻ۙ()Ll/֫֨ۗ;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 198
    new-instance v1, Ll/۟ܳ᩵;

    sget-object v5, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    .line 14
    invoke-direct {v1, v5, v2, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 198
    invoke-static {v0, v1}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto/16 :goto_6

    .line 201
    :cond_0
    invoke-virtual {v1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 202
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v5

    if-nez v5, :cond_1

    goto/16 :goto_5

    .line 206
    :cond_1
    sget-object v1, Ll/᩷۫᩵;->ۙ:[I

    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v1, v1, v5

    packed-switch v1, :pswitch_data_0

    .line 250
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v1

    .line 251
    new-instance v2, Ll/۟ܳ᩵;

    sget-object v5, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    .line 14
    invoke-direct {v2, v5, v1, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 251
    invoke-static {v0, v2}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto/16 :goto_6

    .line 242
    :pswitch_0
    sget-object v1, Ll/֫۟ۗ;->ۚ᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_6

    .line 245
    :cond_2
    new-instance v1, Ll/֡ܳ᩵;

    iget-object v5, p0, Ll/ۤ۫᩵;->ܰ:Ll/֫ۖۗ;

    check-cast v2, Ll/ۗۢۗ;

    invoke-direct {v1, v5, v2}, Ll/֡ܳ᩵;-><init>(Ll/֫ۖۗ;Ll/ۗۢۗ;)V

    invoke-static {v0, v1}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto/16 :goto_6

    .line 238
    :pswitch_1
    check-cast v2, Ll/ۗۢۗ;

    .line 270
    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v1

    .line 271
    invoke-virtual {v1}, Ll/֫֨ۗ;->᩸()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 272
    new-instance v5, Ll/ᩳܳ᩵;

    iget-object v6, p0, Ll/ۤ۫᩵;->ܰ:Ll/֫ۖۗ;

    invoke-direct {v5, v6, v2, v1}, Ll/ᩳܳ᩵;-><init>(Ll/֫ۖۗ;Ll/ۗۢۗ;Ll/֫֨ۗ;)V

    goto :goto_0

    .line 274
    :cond_3
    new-instance v5, Ll/۟ܳ᩵;

    sget-object v2, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    .line 14
    invoke-direct {v5, v2, v1, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 238
    :goto_0
    invoke-static {v0, v5}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto/16 :goto_6

    .line 234
    :pswitch_2
    check-cast v2, Ll/᩶ۢۗ;

    .line 278
    invoke-virtual {v2}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v1

    .line 279
    iget-object v5, p0, Ll/ۤ۫᩵;->ܰ:Ll/֫ۖۗ;

    invoke-virtual {v5}, Ll/֫ۖۗ;->ۧۙ()Ll/ۜ۟ۨ;

    move-result-object v5

    .line 88
    invoke-virtual {v5, v2}, Ll/ۜ۟ۨ;->ۙ(Ll/ܳۢۗ;)Ll/᩶ۡۗ;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 90
    invoke-interface {v5}, Ll/᩶ۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 91
    invoke-virtual {v5}, Ll/֫֨ۗ;->ۤ()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    move-object v5, v4

    :goto_1
    if-eqz v5, :cond_6

    .line 281
    invoke-virtual {v5}, Ll/֫֨ۗ;->᩸()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 282
    invoke-virtual {v2}, Ll/᩶ۢۗ;->ܰۙ()Ll/֡ۢۗ;

    move-result-object v6

    .line 283
    invoke-virtual {v2}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v7

    if-eqz v7, :cond_6

    sget-object v7, Ll/֡ۢۗ;->ۢ:Ll/֡ۢۗ;

    if-eq v6, v7, :cond_6

    sget-object v7, Ll/֡ۢۗ;->֨:Ll/֡ۢۗ;

    if-eq v6, v7, :cond_6

    .line 285
    new-instance v1, Ll/ۢܳ᩵;

    iget-object v6, p0, Ll/ۤ۫᩵;->ܰ:Ll/֫ۖۗ;

    invoke-direct {v1, v6, v2, v5}, Ll/ۢܳ᩵;-><init>(Ll/֫ۖۗ;Ll/᩶ۢۗ;Ll/֫֨ۗ;)V

    goto :goto_2

    :cond_5
    move-object v1, v5

    .line 291
    :cond_6
    new-instance v2, Ll/۟ܳ᩵;

    sget-object v5, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    .line 14
    invoke-direct {v2, v5, v1, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    move-object v1, v2

    .line 234
    :goto_2
    invoke-static {v0, v1}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto/16 :goto_6

    .line 223
    :pswitch_3
    sget-object v1, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    invoke-virtual {v2, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    check-cast v1, Ll/ۤ۠ۗ;

    if-eqz v1, :cond_7

    .line 225
    invoke-virtual {v1}, Ll/ۤ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴ۠ۗ;->ᩴ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ᩳۗ;

    .line 226
    new-instance v5, Ll/۟ܳ᩵;

    sget-object v6, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    invoke-virtual {v2}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v2

    .line 14
    invoke-direct {v5, v6, v2, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 226
    invoke-static {v0, v5}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto :goto_3

    .line 229
    :cond_7
    new-instance v1, Ll/۟ܳ᩵;

    sget-object v5, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    invoke-virtual {v2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v2

    .line 14
    invoke-direct {v1, v5, v2, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 229
    invoke-static {v0, v1}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto/16 :goto_6

    .line 218
    :pswitch_4
    invoke-virtual {v2, v3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    check-cast v1, Ll/᩹֨ۗ;

    .line 219
    new-instance v2, Ll/۟ܳ᩵;

    sget-object v5, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    invoke-virtual {v1}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    .line 14
    invoke-direct {v2, v5, v1, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 219
    invoke-static {v0, v2}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto :goto_6

    .line 213
    :pswitch_5
    check-cast v2, Ll/ۜ֨ۗ;

    .line 257
    invoke-virtual {v2}, Ll/ۜ֨ۗ;->ܿۙ()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 258
    iget-object v1, p0, Ll/ۤ۫᩵;->ܰ:Ll/֫ۖۗ;

    invoke-virtual {v2}, Ll/ۜ֨ۗ;->᩶ۙ()Ll/֨ᩳۗ;

    move-result-object v5

    invoke-virtual {v1, v5}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 259
    sget-object v5, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v1, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 260
    sget-object v5, Ll/ۧ۟ۗ;->ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v1, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    check-cast v1, Ll/ۘ۟ۗ;

    if-eqz v1, :cond_8

    .line 261
    invoke-virtual {v1}, Ll/ۘ۟ۗ;->᩷()Ll/᩺۟ۗ;

    move-result-object v5

    sget-object v6, Ll/᩺۟ۗ;->᩶:Ll/᩺۟ۗ;

    if-ne v5, v6, :cond_8

    .line 262
    invoke-virtual {v1}, Ll/ۘ۟ۗ;->ۙ()Ll/֫֨ۗ;

    move-result-object v1

    goto :goto_4

    .line 266
    :cond_8
    invoke-virtual {v2}, Ll/ۜ֨ۗ;->᩶ۙ()Ll/֨ᩳۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v1

    .line 214
    :goto_4
    new-instance v2, Ll/۟ܳ᩵;

    sget-object v5, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    .line 14
    invoke-direct {v2, v5, v1, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 214
    invoke-static {v0, v2}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto :goto_6

    .line 208
    :pswitch_6
    check-cast v2, Ll/ۗۢۗ;

    invoke-virtual {v2}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫֨ۗ;

    .line 209
    new-instance v2, Ll/۟ܳ᩵;

    sget-object v5, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    .line 14
    invoke-direct {v2, v5, v1, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 209
    invoke-static {v0, v2}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto :goto_6

    .line 203
    :cond_9
    :goto_5
    new-instance v2, Ll/۟ܳ᩵;

    sget-object v5, Ll/ܳܳ᩵;->᩶:Ll/ܳܳ᩵;

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v1

    .line 14
    invoke-direct {v2, v5, v1, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 203
    invoke-static {v0, v2}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    .line 170
    :cond_a
    :goto_6
    invoke-virtual {p1}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ֨ۗ;

    .line 296
    invoke-virtual {v1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v2

    if-nez v2, :cond_b

    goto/16 :goto_a

    .line 300
    :cond_b
    instance-of v5, v2, Ll/ܳۢۗ;

    if-eqz v5, :cond_11

    .line 301
    move-object v5, v2

    check-cast v5, Ll/ܳۢۗ;

    .line 314
    invoke-virtual {v5}, Ll/ܳۢۗ;->᩺ۙ()Ll/ܺ֨ۗ;

    move-result-object v6

    if-nez v6, :cond_c

    goto :goto_8

    .line 318
    :cond_c
    iget-object v7, p0, Ll/ۤ۫᩵;->ܰ:Ll/֫ۖۗ;

    invoke-virtual {v7}, Ll/֫ۖۗ;->ۧۙ()Ll/ۜ۟ۨ;

    move-result-object v7

    .line 319
    invoke-virtual {v7, v5}, Ll/ۜ۟ۨ;->ۙ(Ll/ܳۢۗ;)Ll/᩶ۡۗ;

    move-result-object v7

    if-nez v7, :cond_d

    goto :goto_8

    :cond_d
    if-eq v6, v1, :cond_f

    .line 324
    invoke-virtual {v5, v1}, Ll/ᩳۡۗ;->ۤ(Ll/ܺ֨ۗ;)I

    move-result v6

    invoke-virtual {v5}, Ll/ܳۢۗ;->ۛۙ()I

    move-result v8

    sub-int/2addr v6, v8

    .line 325
    invoke-interface {v7}, Ll/᩶ۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫֨ۗ;

    .line 326
    invoke-virtual {v6}, Ll/֫֨ۗ;->᩸()Z

    move-result v7

    if-nez v7, :cond_e

    goto :goto_8

    .line 329
    :cond_e
    new-instance v7, Ll/֨ܳ᩵;

    iget-object v8, p0, Ll/ۤ۫᩵;->ܰ:Ll/֫ۖۗ;

    invoke-direct {v7, v8, v5, v1, v6}, Ll/֨ܳ᩵;-><init>(Ll/֫ۖۗ;Ll/ܳۢۗ;Ll/ۛ֨ۗ;Ll/֫֨ۗ;)V

    goto :goto_9

    .line 333
    :cond_f
    instance-of v5, v7, Ll/ۖۡۗ;

    if-eqz v5, :cond_10

    .line 334
    check-cast v7, Ll/ۖۡۗ;

    .line 335
    invoke-static {v7}, Ll/ۜ۟ۨ;->ۙ(Ll/ۖۡۗ;)Ll/֨ᩳۗ;

    move-result-object v5

    .line 336
    new-instance v7, Ll/۟ܳ᩵;

    sget-object v6, Ll/ܳܳ᩵;->ܿ:Ll/ܳܳ᩵;

    invoke-virtual {v5}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v5

    invoke-direct {v7, v6, v5, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    goto :goto_9

    :cond_10
    :goto_8
    move-object v7, v4

    :goto_9
    if-eqz v7, :cond_11

    goto :goto_b

    .line 306
    :cond_11
    invoke-virtual {v2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v5

    sget-object v6, Ll/᩺ۢۗ;->֨:Ll/᩺ۢۗ;

    if-ne v5, v6, :cond_12

    sget-object v5, Ll/֫۟ۗ;->ۚ᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-eqz v2, :cond_12

    :goto_a
    move-object v7, v4

    goto :goto_b

    .line 310
    :cond_12
    new-instance v7, Ll/۟ܳ᩵;

    sget-object v2, Ll/ܳܳ᩵;->ܿ:Ll/ܳܳ᩵;

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v1

    invoke-direct {v7, v2, v1, v3}, Ll/۟ܳ᩵;-><init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V

    .line 171
    :goto_b
    invoke-static {v0, v7}, Ll/ۤ۫᩵;->ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V

    goto/16 :goto_7

    :cond_13
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۙ(Ll/᩸۫᩵;Ll/᩵ܳ᩵;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 189
    :cond_0
    instance-of v0, p1, Ll/ۨܳ᩵;

    if-nez v0, :cond_2

    .line 190
    invoke-interface {p1}, Ll/᩵ܳ᩵;->getType()Ll/֫֨ۗ;

    move-result-object v0

    sget-object v1, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 191
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ll/᩸۫᩵;->ۙ()Ljava/util/LinkedHashSet;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ᩷(Ll/ۤ۫᩵;Ll/ۖۡۗ;Ll/ܿ֨ۗ;)V
    .locals 2

    .line 109
    :try_start_0
    invoke-virtual {p2}, Ll/ܿ֨ۗ;->۫()Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    iget-object p0, p0, Ll/ۤ۫᩵;->᩶:Ll/ۢ۫᩵;

    invoke-virtual {p0, p1, p2, v0}, Ll/ۢ۫᩵;->᩸(Ll/ۖۡۗ;Ll/ܿ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;
    :try_end_0
    .catch Ll/ۖۧ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p0

    .line 119
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to set immutable type for var: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catch_1
    move-exception p0

    .line 117
    throw p0
.end method

.method public static ᩸(Ll/ۖۡۗ;)V
    .locals 4

    .line 342
    invoke-virtual {p0}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿ֨ۗ;

    .line 352
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    sget-object v2, Ll/֫۟ۗ;->᩺ۙ:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 353
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v1

    goto :goto_1

    .line 355
    :cond_1
    invoke-virtual {v0}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 356
    sget-object v3, Ll/֫۟ۗ;->᩺ۙ:Ll/֫۟ۗ;

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 357
    invoke-virtual {v2}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    .line 345
    invoke-virtual {v0, v1}, Ll/ܿ֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    goto :goto_0

    :cond_4
    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "TypeInferenceVisitor"

    return-object v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 0

    .line 60
    iput-object p1, p0, Ll/ۤ۫᩵;->ܰ:Ll/֫ۖۗ;

    .line 61
    invoke-virtual {p1}, Ll/֫ۖۗ;->ܶۙ()Ll/ۢ۫᩵;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ۫᩵;->᩶:Ll/ۢ۫᩵;

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 2

    .line 66
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 73
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ۤ۫᩵;->᩸(Ll/ۖۡۗ;)V

    .line 74
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->᩷(Ll/ۖۡۗ;)V

    .line 75
    invoke-virtual {p0, p1}, Ll/ۤ۫᩵;->ۤ(Ll/ۖۡۗ;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/BootstrapMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Type inference failed"

    .line 19
    invoke-static {p1, v1, v0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    .line 77
    :goto_0
    new-instance v1, Ll/ۖۧ᩵;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    const-string v0, "Type inference failed with stack overflow"

    .line 19
    invoke-static {p1, v0, v1}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public final ۤ(Ll/ۖۡۗ;)V
    .locals 3

    .line 101
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    .line 102
    new-instance v1, Ll/ۜ۬ۗ;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Ll/ۜ۬ۗ;-><init>(Ll/ܺ۠ۗ;Ll/ۖۡۗ;I)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 103
    new-instance v1, Ll/ᩳ֡ۗ;

    invoke-direct {v1, p0, p1}, Ll/ᩳ֡ۗ;-><init>(Ll/ۤ۫᩵;Ll/ۖۡۗ;)V

    invoke-static {v0, v1}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final ᩷(Ll/ۖۡۗ;)V
    .locals 1

    .line 87
    invoke-virtual {p1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object p1

    .line 88
    new-instance v0, Ll/۬ܳ᩵;

    invoke-direct {v0, p0}, Ll/۬ܳ᩵;-><init>(Ll/ۤ۫᩵;)V

    invoke-static {p1, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 89
    new-instance v0, Ll/ۙ۫᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method
