.class public final Ll/۠ۡۗ;
.super Ll/ۚᩳۗ;
.source "KIY5"

# interfaces
.implements Ll/᩺ۡۗ;
.implements Ll/ܺܰۗ;
.implements Ljava/lang/Comparable;


# instance fields
.field public final ֨:Ljava/util/ArrayList;

.field public final ۟:Ljava/util/ArrayList;

.field public final ۢ:Ll/֫ۖۗ;

.field public final ᩳ:Ll/ۤۢۗ;


# direct methods
.method public constructor <init>(Ll/֫ۖۗ;Ll/ۤۢۗ;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠ۡۗ;->֨:Ljava/util/ArrayList;

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۠ۡۗ;->۟:Ljava/util/ArrayList;

    .line 61
    iput-object p1, p0, Ll/۠ۡۗ;->ۢ:Ll/֫ۖۗ;

    .line 63
    iput-object p2, p0, Ll/۠ۡۗ;->ᩳ:Ll/ۤۢۗ;

    return-void
.end method

.method public static ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/۠ۡۗ;
    .locals 2

    .line 38
    invoke-virtual {p0, p1}, Ll/֫ۖۗ;->ۙ(Ljava/lang/String;)Ll/۠ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 42
    :cond_0
    invoke-static {p0, p1}, Ll/ۤۢۗ;->ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/ۤۢۗ;

    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ll/ۤۢۗ;->᩷()Ll/ۤۢۗ;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v0}, Ll/ۤۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/۠ۡۗ;->ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/۠ۡۗ;

    move-result-object v0

    .line 44
    :goto_0
    new-instance v1, Ll/۠ۡۗ;

    invoke-direct {v1, p0, p1}, Ll/۠ۡۗ;-><init>(Ll/֫ۖۗ;Ll/ۤۢۗ;)V

    if-eqz v0, :cond_2

    .line 185
    iget-object p1, v0, Ll/۠ۡۗ;->֨:Ljava/util/ArrayList;

    .line 46
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    :cond_2
    invoke-virtual {p0, v1}, Ll/֫ۖۗ;->ۙ(Ll/۠ۡۗ;)V

    return-object v1
.end method

.method public static ۙ(Ll/֫ۖۗ;Ljava/lang/String;Ll/᩻ۡۗ;)Ll/۠ۡۗ;
    .locals 0

    .line 32
    invoke-static {p0, p1}, Ll/۠ۡۗ;->ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/۠ۡۗ;

    move-result-object p0

    .line 189
    iget-object p1, p0, Ll/۠ۡۗ;->۟:Ljava/util/ArrayList;

    .line 33
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 18
    check-cast p1, Ll/۠ۡۗ;

    .line 143
    iget-object v0, p0, Ll/۠ۡۗ;->ᩳ:Ll/ۤۢۗ;

    .line 250
    invoke-virtual {v0}, Ll/ۤۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 143
    iget-object p1, p1, Ll/۠ۡۗ;->ᩳ:Ll/ۤۢۗ;

    .line 250
    invoke-virtual {p1}, Ll/ۤۢۗ;->ۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 237
    :cond_0
    instance-of v0, p1, Ll/۠ۡۗ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 240
    :cond_1
    check-cast p1, Ll/۠ۡۗ;

    iget-object p1, p1, Ll/۠ۡۗ;->ᩳ:Ll/ۤۢۗ;

    iget-object v0, p0, Ll/۠ۡۗ;->ᩳ:Ll/ۤۢۗ;

    invoke-virtual {v0, p1}, Ll/ۤۢۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 245
    iget-object v0, p0, Ll/۠ۡۗ;->ᩳ:Ll/ۤۢۗ;

    invoke-virtual {v0}, Ll/ۤۢۗ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/۠ۡۗ;->ᩳ:Ll/ۤۢۗ;

    .line 255
    invoke-virtual {v0}, Ll/ۤۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final typeName()Ljava/lang/String;
    .locals 1

    const-string v0, "package"

    return-object v0
.end method

.method public final ۘ()Ll/֫ܰۗ;
    .locals 1

    .line 219
    sget-object v0, Ll/֫ܰۗ;->֨:Ll/֫ܰۗ;

    return-object v0
.end method

.method public final ۙۙ()Ll/ۤۢۗ;
    .locals 1

    .line 143
    iget-object v0, p0, Ll/۠ۡۗ;->ᩳ:Ll/ۤۢۗ;

    return-object v0
.end method

.method public final ۜ()Ljava/util/List;
    .locals 1

    .line 189
    iget-object v0, p0, Ll/۠ۡۗ;->۟:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܰ()Ll/֫ۖۗ;
    .locals 1

    .line 224
    iget-object v0, p0, Ll/۠ۡۗ;->ۢ:Ll/֫ۖۗ;

    return-object v0
.end method
