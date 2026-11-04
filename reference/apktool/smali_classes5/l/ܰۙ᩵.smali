.class public final Ll/ܰۙ᩵;
.super Ll/ܺ۠ۗ;
.source "NIT3"


# static fields
.field public static final ᩶:Ll/᩻ܽ᩺;


# instance fields
.field public ܰ:Ll/᩷ۢۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 51
    const-class v0, Ll/ܰۙ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ܰۙ᩵;->᩶:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۙ(Ljava/util/List;)Ljava/util/List;
    .locals 8

    .line 446
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺ֨ۗ;

    .line 447
    invoke-virtual {v3}, Ll/ܺ֨ۗ;->᩷ۙ()Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v2, :cond_8

    .line 461
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    .line 462
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 463
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    const/4 v4, 0x1

    if-ge v1, v0, :cond_5

    .line 465
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺ֨ۗ;

    .line 493
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v5, Ll/᩹֨ۗ;

    if-eqz v6, :cond_0

    .line 494
    move-object v6, v5

    check-cast v6, Ll/᩹֨ۗ;

    invoke-static {v6}, Ll/ܳ۟ۗ;->ۙ(Ll/᩹֨ۗ;)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    .line 0
    :cond_0
    instance-of v6, v5, Ll/ܽ֨ۗ;

    if-eqz v6, :cond_1

    .line 497
    move-object v6, v5

    check-cast v6, Ll/ܽ֨ۗ;

    invoke-virtual {v6}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v6

    .line 498
    instance-of v7, v6, Ll/ۚۢۗ;

    if-eqz v7, :cond_1

    .line 499
    check-cast v6, Ll/ۚۢۗ;

    invoke-virtual {v6}, Ll/ۚۢۗ;->getString()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_1
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_2

    .line 468
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 470
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    .line 484
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v6, v4, :cond_3

    add-int/lit8 v4, v1, -0x1

    .line 485
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺ֨ۗ;

    goto :goto_3

    .line 487
    :cond_3
    invoke-static {v3}, Ll/ۘۧ᩵;->ۙ(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v4

    .line 488
    new-instance v6, Ll/ۚۢۗ;

    invoke-direct {v6, v4}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v4

    .line 471
    :goto_3
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 472
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 474
    :cond_4
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 477
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    .line 484
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v4, :cond_6

    sub-int/2addr v0, v4

    .line 485
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܺ֨ۗ;

    goto :goto_5

    .line 487
    :cond_6
    invoke-static {v3}, Ll/ۘۧ᩵;->ۙ(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p0

    .line 488
    new-instance v0, Ll/ۚۢۗ;

    invoke-direct {v0, p0}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object p0

    .line 478
    :goto_5
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    return-object v2

    :cond_8
    move v2, v3

    goto/16 :goto_0

    :cond_9
    return-object p0
.end method

.method private ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Ll/ᩳۡۗ;
    .locals 12

    .line 130
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto/16 :goto_10

    .line 113
    :cond_0
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺ֨ۗ;

    .line 114
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v4, Ll/ܽ֨ۗ;

    if-eqz v6, :cond_1

    .line 115
    move-object v6, v4

    check-cast v6, Ll/ܽ֨ۗ;

    invoke-virtual {v6}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v6

    .line 116
    invoke-direct {p0, p1, v6, p2}, Ll/ܰۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Ll/ᩳۡۗ;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 101
    invoke-virtual {v4, p1, v6, v5}, Ll/ܺ֨ۗ;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Z)Ll/ܺ֨ۗ;

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v3, :cond_3

    .line 124
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ۗۙ()V

    .line 125
    sget-object v0, Ll/֫۟ۗ;->ۙ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 134
    :cond_3
    sget-object v0, Ll/ۘۙ᩵;->᩷:[I

    invoke-virtual {p2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    const/4 v3, 0x2

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_10

    .line 168
    :pswitch_0
    check-cast p2, Ll/ۜ֨ۗ;

    .line 177
    invoke-virtual {p2}, Ll/ۜ֨ۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object p3

    invoke-virtual {p3}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object p3

    invoke-virtual {p3}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object p3

    sget-object v0, Ll/֫֨ۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {p3, v0}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_33

    .line 178
    invoke-virtual {p2}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result p3

    if-eqz p3, :cond_33

    .line 179
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p3, p3, Ll/ܽ֨ۗ;

    if-eqz p3, :cond_33

    .line 180
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    check-cast p3, Ll/ܽ֨ۗ;

    invoke-virtual {p3}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p3

    .line 181
    invoke-virtual {p3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v3, Ll/᩺ۢۗ;->ۤۙ:Ll/᩺ۢۗ;

    if-ne v0, v3, :cond_33

    .line 182
    invoke-virtual {p3}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    if-eqz v0, :cond_33

    .line 183
    move-object v0, p3

    check-cast v0, Ll/᩻ۢۗ;

    invoke-virtual {v0}, Ll/᩻ۢۗ;->ۛۙ()Ll/֫֨ۗ;

    move-result-object v0

    .line 184
    sget-object v3, Ll/֫֨ۗ;->ۤ:Ll/֫֨ۗ;

    if-eq v0, v3, :cond_4

    sget-object v3, Ll/֫֨ۗ;->ᩴ:Ll/֫֨ۗ;

    if-ne v0, v3, :cond_33

    .line 186
    :cond_4
    invoke-virtual {p3}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    new-array v3, v0, [B

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v4, v0, :cond_7

    .line 188
    invoke-virtual {p3, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v7

    .line 189
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v8, v7, Ll/᩹֨ۗ;

    if-nez v8, :cond_5

    goto/16 :goto_10

    .line 192
    :cond_5
    check-cast v7, Ll/᩹֨ۗ;

    invoke-virtual {v7}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v7

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v3, v4

    int-to-char v7, v7

    .line 193
    sget-object v8, Ll/۬֫᩵;->ۤ:Ljava/util/regex/Pattern;

    const/16 v8, 0x20

    if-gt v8, v7, :cond_6

    const/16 v8, 0x7e

    if-gt v7, v8, :cond_6

    add-int/lit8 v6, v6, 0x1

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_7
    sub-int/2addr v0, v6

    if-lt v6, v0, :cond_33

    .line 198
    invoke-static {p1, p2}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܳۢۗ;)Z

    move-result p3

    if-nez p3, :cond_8

    goto/16 :goto_10

    .line 201
    :cond_8
    new-instance p3, Ll/ۚۢۗ;

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    invoke-direct {p3, v0}, Ll/ۚۢۗ;-><init>(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p2}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    if-ne v0, v5, :cond_9

    .line 203
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 430
    invoke-virtual {p3, p2}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {p3, p2}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 205
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    return-object p3

    .line 208
    :cond_9
    new-instance p1, Ll/᩶ۢۗ;

    iget-object v0, p0, Ll/ܰۙ᩵;->ܰ:Ll/᩷ۢۗ;

    sget-object v3, Ll/֡ۢۗ;->ۡ:Ll/֡ۢۗ;

    invoke-direct {p1, v0, v3, v5}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    .line 209
    invoke-static {p3}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 210
    invoke-static {p1}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object p1

    .line 211
    iget-object p3, p0, Ll/ܰۙ᩵;->ܰ:Ll/᩷ۢۗ;

    invoke-virtual {p3}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object p3

    invoke-virtual {p1, p3}, Ll/֡֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    .line 212
    invoke-virtual {p2, v2, p1}, Ll/ᩳۡۗ;->ۙ(ILl/ܺ֨ۗ;)V

    return-object v1

    .line 157
    :pswitch_1
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p3, p1, Ll/᩹֨ۗ;

    if-eqz p3, :cond_33

    .line 159
    new-instance p3, Ll/ᩳۡۗ;

    sget-object v0, Ll/᩺ۢۗ;->۠:Ll/᩺ۢۗ;

    invoke-direct {p3, v0, v5}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 160
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    invoke-virtual {p3, v0}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 161
    invoke-virtual {p3, p1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 430
    invoke-virtual {p3, p2}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {p3, p2}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    return-object p3

    .line 154
    :pswitch_2
    check-cast p2, Ll/ۗۢۗ;

    .line 223
    sget-object v0, Ll/֫۟ۗ;->ܺۙ:Ll/֫۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto/16 :goto_10

    .line 226
    :cond_a
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    .line 227
    invoke-virtual {v0}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object v3

    .line 0
    instance-of v4, v0, Ll/ܽ֨ۗ;

    if-eqz v4, :cond_b

    .line 231
    move-object v4, v0

    check-cast v4, Ll/ܽ֨ۗ;

    invoke-virtual {v4}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v4

    .line 232
    invoke-virtual {v4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v6, v7, :cond_b

    .line 233
    check-cast v4, Ll/᩶ۢۗ;

    invoke-virtual {v4}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v3

    .line 237
    :cond_b
    invoke-virtual {p2}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫֨ۗ;

    if-eqz p3, :cond_c

    .line 261
    invoke-virtual {p3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->֡:Ll/᩺ۢۗ;

    if-ne v6, v7, :cond_c

    .line 262
    invoke-virtual {v3}, Ll/֫֨ۗ;->ܰ()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v4}, Ll/֫֨ۗ;->ܰ()Z

    move-result v6

    if-eqz v6, :cond_c

    .line 263
    invoke-virtual {v4}, Ll/֫֨ۗ;->᩹()I

    move-result v6

    invoke-virtual {v3}, Ll/֫֨ۗ;->᩹()I

    move-result v7

    if-le v6, v7, :cond_c

    goto/16 :goto_10

    .line 241
    :cond_c
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v6

    sget-object v7, Ll/֫֨ۗ;->ܺ:Ll/֫֨ۗ;

    .line 665
    invoke-virtual {v3, v4}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    const/4 v3, 0x0

    goto :goto_2

    .line 668
    :cond_d
    invoke-virtual {v6}, Ll/֫ۖۗ;->ܽۙ()Ll/۠ܳ᩵;

    move-result-object v6

    invoke-virtual {v6, v3, v4}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object v3

    .line 669
    invoke-virtual {v3}, Ll/ۜܳ᩵;->۫()Z

    move-result v3

    xor-int/2addr v3, v5

    :goto_2
    if-eqz v3, :cond_10

    .line 269
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    .line 270
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v3, Ll/ۛ֨ۗ;

    if-eqz v6, :cond_e

    .line 271
    check-cast v3, Ll/ۛ֨ۗ;

    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 272
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->᩹()I

    move-result v6

    if-ne v6, v5, :cond_e

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->᩶()Z

    move-result v6

    if-nez v6, :cond_e

    .line 273
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v3

    if-eqz v3, :cond_e

    .line 274
    invoke-virtual {v3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->֨:Ll/᩺ۢۗ;

    if-ne v6, v7, :cond_e

    .line 275
    check-cast v3, Ll/ۗۢۗ;

    invoke-virtual {v3}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫֨ۗ;

    .line 276
    invoke-virtual {p2}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v6}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_3

    :cond_e
    const/4 v3, 0x0

    :goto_3
    if-nez v3, :cond_10

    .line 243
    invoke-virtual {p1}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object p1

    if-eqz p3, :cond_f

    .line 284
    invoke-virtual {p3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v3

    sget-object v6, Ll/᩺ۢۗ;->ۢ:Ll/᩺ۢۗ;

    if-ne v3, v6, :cond_f

    .line 285
    check-cast p3, Ll/ۗۢۗ;

    invoke-virtual {p3}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֫֨ۗ;

    .line 286
    invoke-virtual {p1}, Ll/֫ۖۗ;->ܽۙ()Ll/۠ܳ᩵;

    move-result-object p1

    invoke-virtual {p1, p3, v4}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object p1

    .line 287
    invoke-virtual {p1}, Ll/ۜܳ᩵;->۫()Z

    move-result v2

    :cond_f
    if-eqz v2, :cond_33

    .line 244
    :cond_10
    new-instance p1, Ll/ᩳۡۗ;

    sget-object p3, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    invoke-direct {p1, p3, v5}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 245
    invoke-virtual {p2}, Ll/ᩳۡۗ;->getOffset()I

    move-result p3

    invoke-virtual {p1, p3}, Ll/ᩳۡۗ;->ܳ(I)V

    .line 246
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p2

    if-nez p2, :cond_11

    goto :goto_4

    .line 13
    :cond_11
    invoke-virtual {p2}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v1

    .line 246
    :goto_4
    invoke-virtual {p1, v1}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 247
    invoke-virtual {v0}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    return-object p1

    .line 606
    :pswitch_3
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    .line 607
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p3, Ll/ܽ֨ۗ;

    if-nez v0, :cond_12

    goto/16 :goto_10

    .line 610
    :cond_12
    check-cast p3, Ll/ܽ֨ۗ;

    invoke-virtual {p3}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p3

    .line 611
    invoke-virtual {p3}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    .line 612
    sget-object v4, Ll/᩺ۢۗ;->֡:Ll/᩺ۢۗ;

    if-eq v0, v4, :cond_13

    sget-object v6, Ll/᩺ۢۗ;->ۖۙ:Ll/᩺ۢۗ;

    if-ne v0, v6, :cond_33

    .line 613
    :cond_13
    invoke-virtual {p3, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v6, Ll/ܽ֨ۗ;

    if-nez v6, :cond_14

    goto/16 :goto_10

    .line 616
    :cond_14
    invoke-virtual {p3, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v6

    .line 617
    move-object v7, v6

    check-cast v7, Ll/ܽ֨ۗ;

    invoke-virtual {v7}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v7

    .line 618
    invoke-virtual {v7}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    .line 619
    sget-object v9, Ll/᩺ۢۗ;->ۚۙ:Ll/᩺ۢۗ;

    if-eq v8, v9, :cond_15

    sget-object v10, Ll/᩺ۢۗ;->֨ۙ:Ll/᩺ۢۗ;

    if-eq v8, v10, :cond_15

    goto/16 :goto_10

    .line 622
    :cond_15
    move-object v10, p2

    check-cast v10, Ll/ۗۢۗ;

    invoke-virtual {v10}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۬ᩳۗ;

    .line 623
    move-object v11, v7

    check-cast v11, Ll/ۗۢۗ;

    invoke-virtual {v11}, Ll/ۗۢۗ;->᩵ۙ()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۬ᩳۗ;

    .line 624
    invoke-virtual {v10, v11}, Ll/۬ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_16

    goto/16 :goto_10

    :cond_16
    if-ne v8, v9, :cond_17

    .line 628
    :try_start_0
    invoke-virtual {p2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v8

    sget-object v9, Ll/᩺ۢۗ;->᩻ۙ:Ll/᩺ۢۗ;

    if-ne v8, v9, :cond_17

    .line 629
    invoke-virtual {v7, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    .line 630
    invoke-virtual {p2, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v9

    .line 631
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    goto/16 :goto_10

    .line 635
    :cond_17
    invoke-virtual {v6}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v6

    .line 636
    invoke-static {p1, v7}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 637
    invoke-virtual {p2}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v7

    sget-object v8, Ll/᩺ۢۗ;->᩻ۙ:Ll/᩺ۢۗ;

    if-ne v7, v8, :cond_18

    .line 638
    invoke-virtual {p2, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v7

    invoke-static {p1, v7}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    :cond_18
    if-ne v0, v4, :cond_19

    .line 641
    check-cast p3, Ll/᩸ۢۗ;

    .line 642
    invoke-virtual {p3}, Ll/᩸ۢۗ;->᩵ۙ()Ll/ᩴۢۗ;

    move-result-object v0

    invoke-virtual {p3, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    invoke-virtual {p3}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object p3

    .line 75
    new-instance v4, Ll/᩸ۢۗ;

    invoke-direct {v4, v0, v1, v6, p3}, Ll/᩸ۢۗ;-><init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    .line 76
    sget-object p3, Ll/֫۟ۗ;->ᩳ:Ll/֫۟ۗ;

    invoke-virtual {v4, p3}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 430
    invoke-virtual {v4, p2}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {v4, p2}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 644
    invoke-virtual {p2}, Ll/ᩳۡۗ;->getOffset()I

    move-result p3

    invoke-virtual {v4, p3}, Ll/ᩳۡۗ;->ܳ(I)V

    return-object v4

    .line 647
    :cond_19
    invoke-virtual {p3}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    .line 648
    new-instance v4, Ll/ᩳۡۗ;

    sget-object v7, Ll/᩺ۢۗ;->ۖۙ:Ll/᩺ۢۗ;

    add-int/lit8 v8, v0, -0x1

    invoke-direct {v4, v7, v8}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    const/4 v7, 0x1

    :goto_5
    if-ge v7, v0, :cond_1a

    .line 650
    invoke-virtual {p3, v7}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v8

    invoke-virtual {v4, v8}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 652
    :cond_1a
    invoke-static {v4}, Ll/ܺ֨ۗ;->᩷(Ll/ᩳۡۗ;)Ll/ܽ֨ۗ;

    move-result-object v0

    .line 653
    sget-object v4, Ll/֫֨ۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {v0, v4}, Ll/֡֨ۗ;->ۙ(Ll/֫֨ۗ;)V

    .line 654
    sget-object v4, Ll/ᩴۢۗ;->ܿ:Ll/ᩴۢۗ;

    .line 75
    new-instance v7, Ll/᩸ۢۗ;

    invoke-direct {v7, v4, v1, v6, v0}, Ll/᩸ۢۗ;-><init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    .line 76
    sget-object v0, Ll/֫۟ۗ;->ᩳ:Ll/֫۟ۗ;

    invoke-virtual {v7, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 430
    invoke-virtual {v7, p3}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {v7, p3}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 656
    invoke-virtual {p3}, Ll/ᩳۡۗ;->getOffset()I

    move-result p3

    invoke-virtual {v7, p3}, Ll/ᩳۡۗ;->ܳ(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v7

    :catch_0
    move-exception p3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, v2

    aput-object p1, v0, v5

    aput-object p3, v0, v3

    .line 659
    sget-object p1, Ll/ܰۙ᩵;->᩶:Ll/᩻ܽ᩺;

    const-string p2, "Can\'t convert field arith insn: {}, mth: {}"

    invoke-interface {p1, p2, v0}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1

    .line 146
    :pswitch_4
    check-cast p2, Ll/᩶ۢۗ;

    .line 328
    invoke-virtual {p2}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object p3

    .line 330
    invoke-virtual {p3}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v3, "java.lang.StringBuilder"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    .line 331
    invoke-virtual {p3}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object p3

    const-string v0, "toString()Ljava/lang/String;"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_33

    .line 332
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    .line 333
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v0, p3, Ll/ܽ֨ۗ;

    if-eqz v0, :cond_1d

    .line 335
    sget-object p3, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    .line 523
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 524
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    .line 525
    :goto_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v3, v1, Ll/ܽ֨ۗ;

    if-eqz v3, :cond_1c

    .line 526
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    .line 527
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 528
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v3

    if-eq v3, p3, :cond_1c

    .line 529
    invoke-virtual {v1}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v3

    if-nez v3, :cond_1b

    goto :goto_7

    .line 532
    :cond_1b
    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    goto :goto_6

    .line 534
    :cond_1c
    :goto_7
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 336
    invoke-static {p1, p2, v0}, Ll/ܰۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/᩶ۢۗ;Ljava/util/List;)Ll/ᩳۡۗ;

    move-result-object p1

    return-object p1

    .line 0
    :cond_1d
    instance-of v0, p3, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_33

    .line 340
    check-cast p3, Ll/ۛ֨ۗ;

    .line 348
    invoke-virtual {p3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object p3

    .line 349
    invoke-virtual {p3}, Ll/ܿ֨ۗ;->᩶()Z

    move-result v0

    if-nez v0, :cond_26

    invoke-virtual {p3}, Ll/ܿ֨ۗ;->᩹()I

    move-result v0

    if-nez v0, :cond_1e

    goto/16 :goto_a

    .line 352
    :cond_1e
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p3}, Ll/ܿ֨ۗ;->᩹()I

    move-result v1

    add-int/2addr v1, v5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 353
    invoke-virtual {p3}, Ll/ܿ֨ۗ;->ۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v1

    if-nez v1, :cond_1f

    .line 355
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto/16 :goto_b

    .line 357
    :cond_1f
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    invoke-virtual {p3}, Ll/ܿ֨ۗ;->᩵()Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_8
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 359
    invoke-virtual {v2}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v2

    if-nez v2, :cond_20

    .line 361
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_b

    .line 363
    :cond_20
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 365
    :cond_21
    invoke-static {v0, p2}, Ll/᩶֫᩵;->ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I

    move-result p3

    .line 366
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v5

    if-eq v2, p3, :cond_22

    .line 367
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_b

    .line 369
    :cond_22
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 372
    invoke-static {p1, v1}, Ll/᩹֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)Ll/᩷ۡۗ;

    move-result-object p3

    if-nez p3, :cond_23

    .line 374
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_b

    .line 376
    :cond_23
    invoke-virtual {p3}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p3

    .line 377
    invoke-static {p3, v1}, Ll/᩶֫᩵;->ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I

    move-result v1

    .line 378
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 379
    check-cast p3, Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    if-ge v3, v2, :cond_24

    .line 381
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_b

    :cond_24
    :goto_9
    if-ge v5, v2, :cond_27

    add-int v3, v1, v5

    .line 384
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eq v3, v4, :cond_25

    .line 385
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_b

    :cond_25
    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    .line 350
    :cond_26
    :goto_a
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 341
    :cond_27
    :goto_b
    invoke-static {p1, p2, v0}, Ll/ܰۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/᩶ۢۗ;Ljava/util/List;)Ll/ᩳۡۗ;

    move-result-object p1

    return-object p1

    .line 142
    :pswitch_5
    check-cast p2, Ll/ۙۡۗ;

    .line 314
    invoke-virtual {p2}, Ll/ۙۡۗ;->᩵ۙ()Ll/ۢۖۗ;

    move-result-object p3

    .line 315
    invoke-virtual {p3}, Ll/ۢۖۗ;->ᩴۙ()Z

    move-result v0

    if-eqz v0, :cond_28

    .line 316
    invoke-virtual {p3}, Ll/ۢۖۗ;->ۜ()Ll/᩸ܺۤ;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩸ܺۤ;->ۤ()Ll/ܽۢۗ;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ܰۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܽۢۗ;)V

    return-object v1

    .line 318
    :cond_28
    invoke-virtual {p2}, Ll/ۙۡۗ;->ۛۙ()V

    return-object v1

    .line 139
    :pswitch_6
    check-cast p2, Ll/ܽۢۗ;

    invoke-static {p1, p2}, Ll/ܰۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ܽۢۗ;)V

    return-object v1

    .line 136
    :pswitch_7
    check-cast p2, Ll/᩸ۢۗ;

    .line 550
    invoke-virtual {p2}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result p1

    if-eq p1, v3, :cond_29

    goto/16 :goto_10

    .line 554
    :cond_29
    invoke-virtual {p2, v5}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    .line 555
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p3, p1, Ll/ܽ֨ۗ;

    if-eqz p3, :cond_2a

    .line 556
    check-cast p1, Ll/ܽ֨ۗ;

    invoke-virtual {p1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object p1

    .line 557
    invoke-virtual {p1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object p3

    sget-object v0, Ll/᩺ۢۗ;->۠:Ll/᩺ۢۗ;

    if-ne p3, v0, :cond_2b

    .line 558
    invoke-virtual {p1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    .line 559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p3, p1, Ll/᩹֨ۗ;

    if-eqz p3, :cond_2b

    .line 560
    check-cast p1, Ll/᩹֨ۗ;

    goto :goto_c

    .line 0
    :cond_2a
    instance-of p3, p1, Ll/᩹֨ۗ;

    if-eqz p3, :cond_2b

    .line 564
    check-cast p1, Ll/᩹֨ۗ;

    goto :goto_c

    :cond_2b
    move-object p1, v1

    :goto_c
    if-nez p1, :cond_2c

    goto/16 :goto_10

    .line 569
    :cond_2c
    sget-object p3, Ll/ۘۙ᩵;->ۙ:[I

    invoke-virtual {p2}, Ll/᩸ۢۗ;->᩵ۙ()Ll/ᩴۢۗ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p3, p3, v0

    if-eq p3, v5, :cond_31

    if-eq p3, v3, :cond_2d

    goto/16 :goto_10

    .line 586
    :cond_2d
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    .line 587
    invoke-virtual {p1}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v2

    .line 588
    invoke-virtual {p3}, Ll/֡֨ۗ;->getType()Ll/֫֨ۗ;

    move-result-object p1

    sget-object v0, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    if-ne p1, v0, :cond_33

    const-wide/16 v6, 0x0

    cmp-long p1, v2, v6

    if-eqz p1, :cond_2e

    const-wide/16 v6, 0x1

    cmp-long v0, v2, v6

    if-nez v0, :cond_33

    .line 589
    :cond_2e
    new-instance v0, Ll/ᩳۡۗ;

    if-nez p1, :cond_2f

    sget-object p1, Ll/᩺ۢۗ;->ۗۙ:Ll/᩺ۢۗ;

    goto :goto_d

    :cond_2f
    sget-object p1, Ll/᩺ۢۗ;->ܿۙ:Ll/᩺ۢۗ;

    :goto_d
    invoke-direct {v0, p1, v5}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 590
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p1

    if-nez p1, :cond_30

    goto :goto_e

    .line 13
    :cond_30
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v1

    .line 590
    :goto_e
    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 591
    invoke-virtual {p3}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 430
    invoke-virtual {v0, p2}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {v0, p2}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 593
    invoke-virtual {p2}, Ll/ᩳۡۗ;->getOffset()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ᩳۡۗ;->ܳ(I)V

    return-object v0

    .line 572
    :cond_31
    invoke-virtual {p1}, Ll/᩹֨ۗ;->ܺۙ()Z

    move-result p3

    if-eqz p3, :cond_33

    .line 573
    invoke-virtual {p1}, Ll/᩹֨ۗ;->ܽۙ()Ll/᩹֨ۗ;

    move-result-object p1

    if-eqz p1, :cond_33

    .line 575
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p3

    if-nez p3, :cond_32

    goto :goto_f

    .line 13
    :cond_32
    invoke-virtual {p3}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v1

    .line 576
    :goto_f
    new-instance p3, Ll/᩸ۢۗ;

    sget-object v0, Ll/ᩴۢۗ;->۠:Ll/ᩴۢۗ;

    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-direct {p3, v0, v1, v2, p1}, Ll/᩸ۢۗ;-><init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    .line 430
    invoke-virtual {p3, p2}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {p3, p2}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 578
    invoke-virtual {p2}, Ll/ᩳۡۗ;->getOffset()I

    move-result p1

    invoke-virtual {p3, p1}, Ll/ᩳۡۗ;->ܳ(I)V

    return-object p3

    :cond_33
    :goto_10
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/᩶ۢۗ;Ljava/util/List;)Ll/ᩳۡۗ;
    .locals 10

    const/4 v0, 0x0

    .line 393
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto/16 :goto_2

    .line 397
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۡۗ;

    .line 398
    invoke-static {p0, v4, p1}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_2

    .line 402
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    .line 403
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 404
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v7, Ll/᩺ۢۗ;->ۜ:Ll/᩺ۢۗ;

    if-eq v6, v7, :cond_3

    goto :goto_2

    .line 407
    :cond_3
    check-cast v5, Ll/ۜ֨ۗ;

    .line 408
    invoke-virtual {v5}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_5

    .line 409
    invoke-virtual {v5}, Ll/ۜ֨ۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v6

    invoke-virtual {v6}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫֨ۗ;

    .line 410
    invoke-virtual {v6}, Ll/֫֨ۗ;->ۘ()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    .line 413
    :cond_4
    invoke-virtual {v5, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    const/4 v4, 0x1

    :goto_0
    if-ge v4, v1, :cond_8

    .line 416
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۡۗ;

    .line 539
    invoke-virtual {v5}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v6

    sget-object v8, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    if-ne v6, v8, :cond_6

    invoke-virtual {v5}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v6

    if-ne v6, v2, :cond_6

    .line 540
    move-object v6, v5

    check-cast v6, Ll/᩶ۢۗ;

    invoke-virtual {v6}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v6

    .line 541
    invoke-virtual {v6}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v8

    invoke-virtual {v8}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v8

    const-string v9, "java.lang.StringBuilder"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    .line 542
    invoke-virtual {v6}, Ll/᩷ۢۗ;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v8, "append"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 543
    invoke-virtual {v5, v7}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v5

    goto :goto_1

    :cond_6
    move-object v5, v0

    :goto_1
    if-nez v5, :cond_7

    :goto_2
    return-object v0

    .line 421
    :cond_7
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 425
    :cond_8
    new-instance v1, Ll/ᩳۢ֫;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Ll/ᩳۢ֫;-><init>(I)V

    invoke-static {v3, v1}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object v1

    .line 426
    invoke-static {v1}, Ll/ܰۙ᩵;->ۙ(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 427
    new-instance v2, Ll/ᩳۡۗ;

    sget-object v3, Ll/᩺ۢۗ;->ۖۙ:Ll/᩺ۢۗ;

    invoke-direct {v2, v3, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;Ljava/util/List;)V

    .line 428
    sget-object v1, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 429
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-nez v1, :cond_9

    sget-object v1, Ll/֫۟ۗ;->ۗ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 431
    sget-object v1, Ll/֫֨ۗ;->۟:Ll/֫֨ۗ;

    invoke-virtual {p0, v1}, Ll/ۖۡۗ;->ۙ(Ll/֫֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    goto :goto_3

    .line 433
    :cond_9
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 430
    :goto_3
    invoke-virtual {v2, p1}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {v2, p1}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 509
    invoke-static {p0, p1}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 510
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    .line 511
    invoke-static {p0, v3}, Ll/ۢ֫᩵;->᩷(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    goto :goto_4

    .line 513
    :cond_a
    new-instance v1, Ll/ۢ֫᩵;

    .line 42
    invoke-direct {v1, v0, p0}, Ll/ۢ֫᩵;-><init>(Ll/᩷ۡۗ;Ll/ۖۡۗ;)V

    .line 514
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_b
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۡۗ;

    if-eq v3, p1, :cond_b

    .line 516
    invoke-virtual {v1, v3}, Ll/ۢ֫᩵;->ۙ(Ll/ᩳۡۗ;)V

    goto :goto_5

    .line 519
    :cond_c
    invoke-virtual {v1}, Ll/ۢ֫᩵;->ۙ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    const-string p2, "String concatenation convert failed"

    .line 439
    invoke-virtual {p0, p2, p1}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ll/ܽۢۗ;)V
    .locals 4

    const/4 v0, 0x0

    .line 296
    invoke-virtual {p1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    .line 297
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_2

    .line 298
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    .line 299
    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->ۖ:Ll/᩺ۢۗ;

    if-eq v2, v3, :cond_0

    invoke-virtual {v1}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v2

    sget-object v3, Ll/᩺ۢۗ;->ۡ:Ll/᩺ۢۗ;

    if-ne v2, v3, :cond_2

    :cond_0
    const/4 v2, 0x1

    .line 300
    invoke-virtual {p1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܺ֨ۗ;->ۚۙ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 301
    invoke-virtual {p1}, Ll/ܽۢۗ;->᩺ۙ()Ll/ܶۢۗ;

    move-result-object v3

    invoke-virtual {v1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {v1, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-virtual {p1, v3, v0, v2}, Ll/ܽۢۗ;->ۙ(Ll/ܶۢۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    .line 302
    invoke-static {p0, v1}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    return-void

    .line 304
    :cond_1
    sget-object p0, Ll/ܰۙ᩵;->᩶:Ll/᩻ܽ᩺;

    const-string v0, "TODO: cmp {}"

    invoke-interface {p0, p1, v0}, Ll/᩻ܽ᩺;->᩸(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method private ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Z
    .locals 8

    .line 83
    invoke-virtual {p1}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 84
    :goto_0
    move-object v3, v0

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_4

    .line 85
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩳۡۗ;

    .line 86
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x0

    .line 87
    invoke-direct {p0, p2, v4, v6}, Ll/ܰۙ᩵;->ۙ(Ll/ۖۡۗ;Ll/ᩳۡۗ;Ll/ᩳۡۗ;)Ll/ᩳۡۗ;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 89
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_0

    .line 90
    invoke-virtual {v3, v1, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 92
    :cond_0
    invoke-static {v3, v4}, Ll/᩶֫᩵;->ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I

    move-result v2

    const/4 v7, -0x1

    if-eq v2, v7, :cond_2

    .line 96
    invoke-virtual {v3, v2, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 98
    :goto_1
    invoke-static {p2, v4}, Ll/ۢ֫᩵;->ۤ(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V

    .line 99
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ۗۙ()V

    .line 100
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v2, v5, :cond_1

    .line 102
    invoke-direct {p0, p1, p2}, Ll/ܰۙ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Z

    return v3

    :cond_1
    const/4 v2, 0x1

    goto :goto_2

    .line 94
    :cond_2
    new-instance p1, Ll/۠ۧ᩵;

    const-string p2, "Failed to replace insn"

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 94
    throw p1

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v2
.end method


# virtual methods
.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 4

    .line 57
    sget-object v0, Ll/֫֨ۗ;->۟:Ll/֫֨ۗ;

    .line 59
    invoke-static {p1, v0}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v0

    .line 61
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v2, Ll/֫֨ۗ;->ۤ:Ll/֫֨ۗ;

    .line 62
    invoke-static {v2}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v2

    const-string v3, "getBytes"

    .line 57
    invoke-static {p1, v0, v3, v1, v2}, Ll/᩷ۢۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ljava/lang/String;Ljava/util/List;Ll/֫֨ۗ;)Ll/᩷ۢۗ;

    move-result-object p1

    iput-object p1, p0, Ll/ܰۙ᩵;->ܰ:Ll/᩷ۢۗ;

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 3

    .line 67
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 71
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 72
    invoke-direct {p0, v2, p1}, Ll/ܰۙ᩵;->ۙ(Ll/᩷ۡۗ;Ll/ۖۡۗ;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    if-nez v1, :cond_4

    .line 76
    sget-object v0, Ll/֫۟ۗ;->ۙ᩷:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    return-void

    .line 77
    :cond_4
    :goto_2
    invoke-static {p1}, Ll/ۜᩴ᩵;->᩷(Ll/ۖۡۗ;)V

    return-void
.end method
