.class public final Ll/᩶֫᩵;
.super Ljava/lang/Object;
.source "U4RU"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ܰ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/᩶֫᩵;->ܰ:Ljava/util/List;

    return-void
.end method

.method public static ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I
    .locals 3

    .line 36
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 38
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ۙ(Ll/᩷ۡۗ;Ll/ᩳۡۗ;)V
    .locals 1

    .line 28
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p0

    .line 18
    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۡۗ;

    if-ne v0, p1, :cond_0

    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final get(I)Ll/ᩳۡۗ;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/᩶֫᩵;->ܰ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۡۗ;

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/᩶֫᩵;->ܰ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 74
    iget-object v0, p0, Ll/᩶֫᩵;->ܰ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ۙ(Ll/ᩳۡۗ;)I
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩶֫᩵;->ܰ:Ljava/util/List;

    invoke-static {v0, p1}, Ll/᩶֫᩵;->ۙ(Ljava/util/List;Ll/ᩳۡۗ;)I

    move-result p1

    return p1
.end method
