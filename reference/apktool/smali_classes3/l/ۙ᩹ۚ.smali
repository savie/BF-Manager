.class public final Ll/ۙ᩹ۚ;
.super Ll/ᩴ᩸ۤ;
.source "W6LU"


# instance fields
.field public final ܿ:Ljava/util/ArrayList;

.field public final ᩶:Ll/ۜܳۤ;


# direct methods
.method public constructor <init>(Ll/ۜܳۤ;Ljava/util/ArrayList;)V
    .locals 11

    .line 32
    invoke-direct {p0}, Ll/ᩴ᩸ۤ;-><init>()V

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙ᩹ۚ;->ܿ:Ljava/util/ArrayList;

    .line 33
    iput-object p1, p0, Ll/ۙ᩹ۚ;->᩶:Ll/ۜܳۤ;

    .line 34
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 35
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ܶۚ;

    .line 36
    invoke-virtual {v1}, Ll/֨ܶۚ;->ۙ()Z

    move-result v2

    iget v3, v1, Ll/֨ܶۚ;->۫:I

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ll/֨ܶۚ;->᩷()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    ushr-int/lit8 v2, v3, 0x10

    and-int/lit16 v2, v2, 0xff

    .line 40
    invoke-interface {p1}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    move-object v6, v5

    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "RESOURCE_PATCH_CORRUPT"

    if-eqz v7, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۤ۫ۤ;

    .line 41
    invoke-interface {v7}, Ll/ۤ۫ۤ;->۫()I

    move-result v9

    ushr-int/lit8 v10, v3, 0x18

    if-eq v9, v10, :cond_2

    goto :goto_1

    :cond_2
    if-nez v6, :cond_3

    move-object v6, v7

    .line 43
    :cond_3
    invoke-interface {v7}, Ll/ۤ۫ۤ;->ܽ᩷()Ljava/lang/Iterable;

    move-result-object v9

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܳ۫ۤ;

    .line 44
    invoke-interface {v10}, Ll/ܳ۫ۤ;->ܶۙ()I

    move-result v10

    if-eq v10, v2, :cond_4

    goto :goto_2

    :cond_4
    if-nez v5, :cond_5

    move-object v5, v7

    goto :goto_2

    :cond_5
    const-string p1, "Resource patch type identity is ambiguous."

    .line 264
    invoke-static {v8, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 45
    throw p1

    :cond_6
    if-nez v5, :cond_7

    move-object v5, v6

    :cond_7
    if-eqz v5, :cond_9

    .line 51
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    if-nez v2, :cond_8

    .line 52
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    :cond_8
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_9
    const-string p1, "Resource patch package is missing."

    .line 264
    invoke-static {v8, p1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object p1

    .line 50
    throw p1

    .line 55
    :cond_a
    invoke-interface {p1}, Ll/ۜܳۤ;->۠()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۤ۫ۤ;

    .line 56
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 57
    iget-object v2, p0, Ll/ۙ᩹ۚ;->ܿ:Ljava/util/ArrayList;

    if-nez v1, :cond_b

    goto :goto_4

    :cond_b
    new-instance v3, Ll/ۜܶۚ;

    invoke-direct {v3, p0, p2, v1}, Ll/ۜܶۚ;-><init>(Ll/ۜܳۤ;Ll/ۤ۫ۤ;Ljava/util/ArrayList;)V

    move-object p2, v3

    :goto_4
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_c
    return-void
.end method


# virtual methods
.method public final ۠()Ljava/lang/Iterable;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۙ᩹ۚ;->ܿ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۧ(I)Ll/ۤ۫ۤ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۙ᩹ۚ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ۫ۤ;

    return-object p1
.end method

.method public final ۨ()I
    .locals 1

    .line 62
    iget-object v0, p0, Ll/ۙ᩹ۚ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ۫᩷()Ll/ۗ۫ۤ;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۙ᩹ۚ;->᩶:Ll/ۜܳۤ;

    invoke-interface {v0}, Ll/ۜܳۤ;->۫᩷()Ll/ۗ۫ۤ;

    move-result-object v0

    return-object v0
.end method
