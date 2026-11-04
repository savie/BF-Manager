.class public final Ll/֡᩶ۗ;
.super Ljava/lang/Object;
.source "F9B6"

# interfaces
.implements Ll/۟ܰۗ;


# instance fields
.field public final ۙ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/֡᩶ۗ;->ۙ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CallSite{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֡᩶ۗ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()V
    .locals 4

    .line 20
    iget-object v0, p0, Ll/֡᩶ۗ;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳ᩶ۗ;

    .line 21
    sget-object v2, Ll/ܿ᩶ۗ;->ۙ:[I

    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܰۗ;

    invoke-interface {v1}, Ll/۬ܰۗ;->ۙ()V

    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {v1}, Ll/ܳ᩶ۗ;->᩷()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ܰۗ;

    invoke-interface {v1}, Ll/۠ܰۗ;->ۙ()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/֡᩶ۗ;->ۙ:Ljava/util/ArrayList;

    return-object v0
.end method
