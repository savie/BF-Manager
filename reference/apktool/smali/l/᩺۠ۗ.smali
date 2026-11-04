.class public final Ll/᩺۠ۗ;
.super Ll/ܺ۠ۗ;
.source "A6I5"


# instance fields
.field public ܰ:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 37
    const-class v0, Ll/᩺۠ۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 2

    .line 43
    invoke-virtual {p1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Ll/᩺۠ۗ;->ܰ:Ljava/util/Map;

    .line 44
    new-instance v0, Ll/ۨ۠ۗ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۨ۠ۗ;-><init>(I)V

    invoke-virtual {p1, v0}, Ll/֫ۖۗ;->ۙ(Ll/ۨ۠ۗ;)V

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 2

    .line 121
    iget-object v0, p0, Ll/᩺۠ۗ;->ܰ:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 122
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 124
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ᩳۗ;->ܺ()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    .line 126
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 50
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 58
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۜۘۗ;

    .line 59
    invoke-interface {p1}, Ll/ۜۘۗ;->ۤۤ()Ll/ۙܰۗ;

    .line 60
    sget-object p1, Ll/ۛ۠ۗ;->ۙ:[I

    const/4 p1, 0x0

    throw p1

    .line 53
    :cond_3
    :goto_1
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object p1

    new-instance v0, Ll/᩹۬ۗ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩹۬ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    const/4 p1, 0x0

    return p1
.end method
