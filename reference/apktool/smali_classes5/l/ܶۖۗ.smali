.class public final synthetic Ll/ܶۖۗ;
.super Ljava/lang/Object;
.source "95VI"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic ܰ:Ll/ۗۖۗ;

.field public final synthetic ᩶:Ljava/util/HashMap;


# direct methods
.method public synthetic constructor <init>(Ll/ۗۖۗ;Ljava/util/HashMap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۖۗ;->ܰ:Ll/ۗۖۗ;

    iput-object p2, p0, Ll/ܶۖۗ;->᩶:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 9

    .line 2
    check-cast p1, Ll/֫֨ۗ;

    .line 4
    check-cast p2, Ll/֫֨ۗ;

    .line 339
    invoke-virtual {p2}, Ll/֫֨ۗ;->֫()Ljava/util/List;

    move-result-object v0

    .line 340
    invoke-static {v0}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 343
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 344
    iget-object v2, p0, Ll/ܶۖۗ;->ܰ:Ll/ۗۖۗ;

    invoke-virtual {v2, p2}, Ll/ۗۖۗ;->ۙ(Ll/֫֨ۗ;)Ljava/util/List;

    move-result-object v2

    .line 345
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ne v1, v3, :cond_4

    .line 346
    invoke-virtual {p1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Ll/ܶۖۗ;->᩶:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 347
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4, v1}, Ljava/util/HashMap;-><init>(I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_3

    .line 349
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫֨ۗ;

    if-eqz p1, :cond_1

    .line 350
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫֨ۗ;

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 351
    :goto_1
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֫֨ۗ;

    if-eqz v7, :cond_2

    move-object v6, v7

    :cond_2
    invoke-virtual {v4, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 353
    :cond_3
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩹ۧۗ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
