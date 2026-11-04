.class public final Ll/ۗ᩹ܳ;
.super Ljava/lang/Object;
.source "D6GY"


# instance fields
.field public final ۙ:Ljava/util/List;

.field public final ۤ:Ljava/util/List;

.field public final ۫:Ljava/util/List;

.field public final ܳ:Ljava/lang/String;

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:Ljava/util/List;

.field public final ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 2

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    iput-object p1, p0, Ll/ۗ᩹ܳ;->ܳ:Ljava/lang/String;

    .line 194
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_0
    iput-object p1, p0, Ll/ۗ᩹ܳ;->ᩴ:Ljava/lang/String;

    .line 195
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩹ܳ;->ۤ:Ljava/util/List;

    .line 196
    invoke-static {p3}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩹ܳ;->᩸:Ljava/util/List;

    .line 197
    invoke-static {p4}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩹ܳ;->᩷:Ljava/util/List;

    .line 198
    invoke-static {p5}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩹ܳ;->ۙ:Ljava/util/List;

    .line 199
    invoke-static {p6}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩹ܳ;->۫:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 218
    iget-object v0, p0, Ll/ۗ᩹ܳ;->ۙ:Ljava/util/List;

    return-object v0
.end method

.method public final ۤ()Ljava/util/List;
    .locals 1

    .line 209
    iget-object v0, p0, Ll/ۗ᩹ܳ;->ۤ:Ljava/util/List;

    return-object v0
.end method

.method public final ۫()Ljava/util/List;
    .locals 1

    .line 221
    iget-object v0, p0, Ll/ۗ᩹ܳ;->۫:Ljava/util/List;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ۗ᩹ܳ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ۗ᩹ܳ;->ᩴ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 215
    iget-object v0, p0, Ll/ۗ᩹ܳ;->᩷:Ljava/util/List;

    return-object v0
.end method

.method public final ᩸()Ljava/util/List;
    .locals 1

    .line 212
    iget-object v0, p0, Ll/ۗ᩹ܳ;->᩸:Ljava/util/List;

    return-object v0
.end method
