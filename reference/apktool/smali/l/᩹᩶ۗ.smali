.class public final Ll/᩹᩶ۗ;
.super Ll/ܺ᩶ۗ;
.source "PIV4"


# instance fields
.field public final ܰ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/᩹᩶ۗ;->ܰ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ۙ(Ljava/util/List;)Ll/᩹᩶ۗ;
    .locals 2

    .line 15
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 20
    invoke-static {v1}, Ll/ۗ᩶ۗ;->ۙ(Ljava/util/List;)Ll/ۗ᩶ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 22
    :cond_1
    new-instance p0, Ll/᩹᩶ۗ;

    invoke-direct {p0, v0}, Ll/᩹᩶ۗ;-><init>(Ljava/util/ArrayList;)V

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/᩹᩶ۗ;->ܰ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 12
    sget-object v0, Ll/᩻᩶ۗ;->᩸:Ll/᩻᩶ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/᩹᩶ۗ;->ܰ:Ljava/util/ArrayList;

    return-object v0
.end method
