.class public final Ll/ۜܿۗ;
.super Ljava/lang/Object;
.source "86FQ"


# instance fields
.field public final ۙ:I

.field public ۤ:Ljava/util/Map;

.field public ᩴ:Ljava/util/List;

.field public final ᩷:Ll/֫֨ۗ;

.field public ᩸:[Ll/֫֨ۗ;


# direct methods
.method public constructor <init>(ILl/֫֨ۗ;)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, Ll/ۜܿۗ;->ۤ:Ljava/util/Map;

    .line 25
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/ۜܿۗ;->ᩴ:Ljava/util/List;

    .line 30
    iput-object p2, p0, Ll/ۜܿۗ;->᩷:Ll/֫֨ۗ;

    .line 32
    iput p1, p0, Ll/ۜܿۗ;->ۙ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 113
    const-class v0, Ll/ۜܿۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 116
    :cond_1
    check-cast p1, Ll/ۜܿۗ;

    .line 117
    iget-object v0, p0, Ll/ۜܿۗ;->᩷:Ll/֫֨ۗ;

    iget-object p1, p1, Ll/ۜܿۗ;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v0, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۜܿۗ;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ۜܿۗ;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/֫֨ۗ;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۜܿۗ;->᩷:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ۙ(Ljava/util/ArrayList;)V
    .locals 3

    .line 84
    new-instance v0, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 85
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ֡ۗ;

    .line 86
    invoke-virtual {v1}, Ll/ۤ֡ۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۢۗ;->ܺ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 80
    :cond_0
    iput-object v0, p0, Ll/ۜܿۗ;->ۤ:Ljava/util/Map;

    return-void
.end method

.method public final ۙ(Ljava/util/List;)V
    .locals 0

    .line 96
    iput-object p1, p0, Ll/ۜܿۗ;->ᩴ:Ljava/util/List;

    return-void
.end method

.method public final ۙ([Ll/֫֨ۗ;)V
    .locals 0

    .line 65
    iput-object p1, p0, Ll/ۜܿۗ;->᩸:[Ll/֫֨ۗ;

    return-void
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۜܿۗ;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v0}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫()Z
    .locals 2

    .line 53
    iget v0, p0, Ll/ۜܿۗ;->ۙ:I

    const/16 v1, 0x200

    invoke-static {v0, v1}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v0

    return v0
.end method

.method public final ܳ()Z
    .locals 2

    const/16 v0, 0x4000

    .line 57
    iget v1, p0, Ll/ۜܿۗ;->ۙ:I

    invoke-static {v1, v0}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v0

    return v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۜܿۗ;->ᩴ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩷()Ljava/util/Map;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۜܿۗ;->ۤ:Ljava/util/Map;

    return-object v0
.end method

.method public final ᩸()[Ll/֫֨ۗ;
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۜܿۗ;->᩸:[Ll/֫֨ۗ;

    return-object v0
.end method
