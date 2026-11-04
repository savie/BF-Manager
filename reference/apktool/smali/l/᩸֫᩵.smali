.class public final Ll/᩸֫᩵;
.super Ljava/lang/Object;
.source "O6FB"


# instance fields
.field public final ۙ:Ll/᩹ۡۗ;

.field public final ᩷:Ll/ᩳۡۗ;


# direct methods
.method public constructor <init>(Ll/᩹ۡۗ;Ll/ᩳۡۗ;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Ll/᩸֫᩵;->ۙ:Ll/᩹ۡۗ;

    .line 14
    iput-object p2, p0, Ll/᩸֫᩵;->᩷:Ll/ᩳۡۗ;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 30
    :cond_0
    instance-of v1, p1, Ll/᩸֫᩵;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 33
    :cond_1
    check-cast p1, Ll/᩸֫᩵;

    .line 34
    iget-object v1, p0, Ll/᩸֫᩵;->ۙ:Ll/᩹ۡۗ;

    iget-object v3, p1, Ll/᩸֫᩵;->ۙ:Ll/᩹ۡۗ;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/᩸֫᩵;->᩷:Ll/ᩳۡۗ;

    iget-object p1, p1, Ll/᩸֫᩵;->᩷:Ll/ᩳۡۗ;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 39
    iget-object v2, p0, Ll/᩸֫᩵;->ۙ:Ll/᩹ۡۗ;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Ll/᩸֫᩵;->᩷:Ll/ᩳۡۗ;

    aput-object v2, v0, v1

    invoke-static {v0}, Ll/ܽۚۗ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BlockInsnPair{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸֫᩵;->ۙ:Ll/᩹ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩸֫᩵;->᩷:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/᩹ۡۗ;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/᩸֫᩵;->ۙ:Ll/᩹ۡۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ᩳۡۗ;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/᩸֫᩵;->᩷:Ll/ᩳۡۗ;

    return-object v0
.end method
