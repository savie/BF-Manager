.class public final Ll/۟ܳ᩵;
.super Ljava/lang/Object;
.source "GIS0"

# interfaces
.implements Ll/᩵ܳ᩵;


# instance fields
.field public final ۙ:Ll/ܳܳ᩵;

.field public final ᩷:Ll/֫֨ۗ;


# direct methods
.method public constructor <init>(Ll/ܳܳ᩵;Ll/֫֨ۗ;I)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ll/۟ܳ᩵;->ۙ:Ll/ܳܳ᩵;

    .line 19
    iput-object p2, p0, Ll/۟ܳ᩵;->᩷:Ll/֫֨ۗ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 43
    const-class v2, Ll/۟ܳ᩵;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 46
    :cond_1
    check-cast p1, Ll/۟ܳ᩵;

    .line 47
    iget-object v2, p0, Ll/۟ܳ᩵;->ۙ:Ll/ܳܳ᩵;

    iget-object v3, p1, Ll/۟ܳ᩵;->ۙ:Ll/ܳܳ᩵;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/۟ܳ᩵;->᩷:Ll/֫֨ۗ;

    iget-object p1, p1, Ll/۟ܳ᩵;->᩷:Ll/֫֨ۗ;

    invoke-static {v2, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final getType()Ll/֫֨ۗ;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/۟ܳ᩵;->᩷:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 52
    iget-object v2, p0, Ll/۟ܳ᩵;->ۙ:Ll/ܳܳ᩵;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۟ܳ᩵;->᩷:Ll/֫֨ۗ;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ܽۚۗ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۟ܳ᩵;->ۙ:Ll/ܳܳ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۟ܳ᩵;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/ܳܳ᩵;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/۟ܳ᩵;->ۙ:Ll/ܳܳ᩵;

    return-object v0
.end method
