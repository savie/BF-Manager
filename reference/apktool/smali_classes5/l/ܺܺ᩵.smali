.class public final Ll/ܺܺ᩵;
.super Ljava/lang/Object;
.source "5IV1"

# interfaces
.implements Ll/֨ܰۗ;


# instance fields
.field public ۙ:I

.field public final ۤ:Ll/ۛܺ᩵;

.field public ۫:Ljava/lang/String;

.field public ܳ:Ljava/lang/String;

.field public ᩴ:Ljava/lang/String;

.field public ᩷:I

.field public ᩸:Ll/ܳ᩶ۗ;


# direct methods
.method public constructor <init>(Ll/ۛܺ᩵;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Ll/ܺܺ᩵;->ۤ:Ll/ۛܺ᩵;

    return-void
.end method


# virtual methods
.method public final getAttributes()Ljava/util/ArrayList;
    .locals 3

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 84
    iget-object v1, p0, Ll/ܺܺ᩵;->᩸:Ll/ܳ᩶ۗ;

    if-eqz v1, :cond_0

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_0
    iget-object v1, p0, Ll/ܺܺ᩵;->ۤ:Ll/ۛܺ᩵;

    if-eqz v1, :cond_1

    .line 78
    iget v2, p0, Ll/ܺܺ᩵;->᩷:I

    invoke-virtual {v1, v2}, Ll/ۛܺ᩵;->ۙ(I)Ljava/util/List;

    move-result-object v1

    .line 85
    invoke-static {v0, v1}, Ll/֫ܺ᩵;->ۙ(Ljava/util/ArrayList;Ljava/util/List;)V

    return-object v0

    .line 76
    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Annotation parser not initialized"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ܺܺ᩵;->ᩴ:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ܺܺ᩵;->۫:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    iget-object v1, p0, Ll/ܺܺ᩵;->ܳ:Ljava/lang/String;

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    iget-object v1, p0, Ll/ܺܺ᩵;->ᩴ:Ljava/lang/String;

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    iget-object v1, p0, Ll/ܺܺ᩵;->۫:Ljava/lang/String;

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 0

    .line 63
    iput p1, p0, Ll/ܺܺ᩵;->ۙ:I

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Ll/ܺܺ᩵;->ᩴ:Ljava/lang/String;

    return-void
.end method

.method public final ۙ(Ll/ܳ᩶ۗ;)V
    .locals 0

    .line 71
    iput-object p1, p0, Ll/ܺܺ᩵;->᩸:Ll/ܳ᩶ۗ;

    return-void
.end method

.method public final ۤ(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Ll/ܺܺ᩵;->۫:Ljava/lang/String;

    return-void
.end method

.method public final ᩷()I
    .locals 1

    .line 59
    iget v0, p0, Ll/ܺܺ᩵;->ۙ:I

    return v0
.end method

.method public final ᩷(I)V
    .locals 0

    .line 67
    iput p1, p0, Ll/ܺܺ᩵;->᩷:I

    return-void
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Ll/ܺܺ᩵;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ܺܺ᩵;->ܳ:Ljava/lang/String;

    return-object v0
.end method
