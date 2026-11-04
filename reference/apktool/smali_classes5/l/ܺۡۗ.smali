.class public final Ll/ܺۡۗ;
.super Ll/ܺ۟ۗ;
.source "E5RN"


# instance fields
.field public final ֡:Ll/᩷ۡۗ;

.field public final ܿ:Ll/᩷ۡۗ;


# direct methods
.method public constructor <init>(Ll/᩷ۡۗ;Ll/᩷ۡۗ;Z)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    if-eqz p3, :cond_0

    .line 16
    sget-object p3, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, p3}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 19
    :cond_0
    iput-object p1, p0, Ll/ܺۡۗ;->ܿ:Ll/᩷ۡۗ;

    .line 20
    iput-object p2, p0, Ll/ܺۡۗ;->֡:Ll/᩷ۡۗ;

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

    .line 41
    const-class v2, Ll/ܺۡۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 44
    :cond_1
    check-cast p1, Ll/ܺۡۗ;

    .line 45
    iget-object v2, p0, Ll/ܺۡۗ;->ܿ:Ll/᩷ۡۗ;

    iget-object v3, p1, Ll/ܺۡۗ;->ܿ:Ll/᩷ۡۗ;

    invoke-virtual {v2, v3}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ܺۡۗ;->֡:Ll/᩷ۡۗ;

    iget-object p1, p1, Ll/ܺۡۗ;->֡:Ll/᩷ۡۗ;

    invoke-virtual {v2, p1}, Ll/᩷ۡۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 50
    iget-object v0, p0, Ll/ܺۡۗ;->ܿ:Ll/᩷ۡۗ;

    invoke-virtual {v0}, Ll/᩷ۡۗ;->hashCode()I

    move-result v0

    iget-object v1, p0, Ll/ܺۡۗ;->֡:Ll/᩷ۡۗ;

    invoke-virtual {v1}, Ll/᩷ۡۗ;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Edge: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܺۡۗ;->ܿ:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܺۡۗ;->֡:Ll/᩷ۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۖ()Ll/᩷ۡۗ;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ܺۡۗ;->ܿ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۠()Ll/᩷ۡۗ;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/ܺۡۗ;->֡:Ll/᩷ۡۗ;

    return-object v0
.end method
