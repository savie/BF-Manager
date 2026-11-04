.class public final Ll/ۖ۟ۗ;
.super Ljava/lang/Object;
.source "AIXM"

# interfaces
.implements Ll/ۧ᩶ۗ;


# instance fields
.field public ܰ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Enum fields map: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۖ۟ۗ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/ۖ۟ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 12
    sget-object v0, Ll/ۧ۟ۗ;->֫:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ(Ll/ܽۡۗ;)Ll/ۡ۟ۗ;
    .locals 1

    .line 31
    iget-object v0, p0, Ll/ۖ۟ۗ;->ܰ:Ljava/util/HashMap;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 34
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۡ۟ۗ;

    return-object p1
.end method

.method public final ۙ(Ll/ܽۡۗ;Ljava/lang/Integer;Ll/ܽۡۗ;)V
    .locals 2

    .line 38
    invoke-virtual {p0, p1}, Ll/ۖ۟ۗ;->ۙ(Ll/ܽۡۗ;)Ll/ۡ۟ۗ;

    move-result-object v0

    if-nez v0, :cond_1

    .line 40
    new-instance v0, Ll/ۡ۟ۗ;

    invoke-direct {v0}, Ll/ۡ۟ۗ;-><init>()V

    .line 41
    iget-object v1, p0, Ll/ۖ۟ۗ;->ܰ:Ljava/util/HashMap;

    if-nez v1, :cond_0

    .line 42
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/ۖ۟ۗ;->ܰ:Ljava/util/HashMap;

    .line 44
    :cond_0
    iget-object v1, p0, Ll/ۖ۟ۗ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    :cond_1
    invoke-virtual {v0, p2, p3}, Ll/ۡ۟ۗ;->ۙ(Ljava/lang/Integer;Ll/ܽۡۗ;)V

    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۖ۟ۗ;->ܰ:Ljava/util/HashMap;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
