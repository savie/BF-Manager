.class public final Ll/ᩳۤ᩵;
.super Ljava/lang/Object;
.source "OIY9"


# instance fields
.field public final ۙ:Ll/᩷ۡۗ;

.field public ۤ:I

.field public ᩷:I


# direct methods
.method public constructor <init>(Ll/᩷ۡۗ;II)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput p2, p0, Ll/ᩳۤ᩵;->ۤ:I

    .line 23
    iput-object p1, p0, Ll/ᩳۤ᩵;->ۙ:Ll/᩷ۡۗ;

    .line 24
    iput p3, p0, Ll/ᩳۤ᩵;->᩷:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 29
    invoke-virtual {p0}, Ll/ᩳۤ᩵;->ܳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/ᩳۤ᩵;
    .locals 4

    .line 44
    new-instance v0, Ll/ᩳۤ᩵;

    iget v1, p0, Ll/ᩳۤ᩵;->ۤ:I

    iget v2, p0, Ll/ᩳۤ᩵;->᩷:I

    iget-object v3, p0, Ll/ᩳۤ᩵;->ۙ:Ll/᩷ۡۗ;

    invoke-direct {v0, v3, v1, v2}, Ll/ᩳۤ᩵;-><init>(Ll/᩷ۡۗ;II)V

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 0

    .line 72
    iput p1, p0, Ll/ᩳۤ᩵;->᩷:I

    return-void
.end method

.method public final ۤ()I
    .locals 1

    .line 68
    iget v0, p0, Ll/ᩳۤ᩵;->᩷:I

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 3

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BlockInsnInfo - "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    iget-object v1, p0, Ll/ᩳۤ᩵;->ۙ:Ll/᩷ۡۗ;

    invoke-virtual {v1}, Ll/᩷ۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " [\u2191 "

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    iget v1, p0, Ll/ᩳۤ᩵;->ۤ:I

    const-string v2, "] [\u2193 0] "

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 6

    .line 76
    iget-object v0, p0, Ll/ᩳۤ᩵;->ۙ:Ll/᩷ۡۗ;

    invoke-virtual {v0}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    .line 77
    iget v2, p0, Ll/ᩳۤ᩵;->ۤ:I

    .line 78
    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gt v2, v3, :cond_0

    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v2, p0, Ll/ᩳۤ᩵;->ۤ:I

    sub-int/2addr v0, v2

    const/4 v2, 0x0

    .line 84
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 79
    :cond_0
    new-instance v3, Ljava/lang/IndexOutOfBoundsException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Attempted to get instructions slice of block "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/᩷ۡۗ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " with "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " skipped instructions whilst only having "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " instructions in block."

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v3
.end method

.method public final ᩷()Ll/᩷ۡۗ;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/ᩳۤ᩵;->ۙ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ᩷(I)V
    .locals 0

    .line 64
    iput p1, p0, Ll/ᩳۤ᩵;->ۤ:I

    return-void
.end method

.method public final ᩸()I
    .locals 1

    .line 60
    iget v0, p0, Ll/ᩳۤ᩵;->ۤ:I

    return v0
.end method
