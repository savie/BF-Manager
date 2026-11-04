.class public final Ll/۫ᩳۗ;
.super Ljava/lang/Object;
.source "96DS"


# instance fields
.field public final ۙ:I

.field public final ᩷:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput p1, p0, Ll/۫ᩳۗ;->᩷:I

    .line 12
    iput p2, p0, Ll/۫ᩳۗ;->ۙ:I

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

    if-nez p1, :cond_1

    return v1

    .line 36
    :cond_1
    const-class v2, Ll/۫ᩳۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 39
    :cond_2
    check-cast p1, Ll/۫ᩳۗ;

    .line 40
    iget v2, p0, Ll/۫ᩳۗ;->ۙ:I

    iget v3, p1, Ll/۫ᩳۗ;->ۙ:I

    if-ne v2, v3, :cond_3

    iget v2, p0, Ll/۫ᩳۗ;->᩷:I

    iget p1, p1, Ll/۫ᩳۗ;->᩷:I

    if-ne v2, p1, :cond_3

    return v0

    :cond_3
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 25
    iget v0, p0, Ll/۫ᩳۗ;->ۙ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/۫ᩳۗ;->᩷:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JUMP: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/۫ᩳۗ;->᩷:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/۫ᩳۗ;->ۙ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()I
    .locals 1

    .line 20
    iget v0, p0, Ll/۫ᩳۗ;->ۙ:I

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 16
    iget v0, p0, Ll/۫ᩳۗ;->᩷:I

    return v0
.end method
