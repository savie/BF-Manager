.class public final Ll/۬۫᩵;
.super Ljava/lang/Object;
.source "IIX7"


# instance fields
.field public final ۙ:Ll/ܺ֨ۗ;

.field public final ۤ:Ll/֫֨ۗ;

.field public final ᩷:Ll/ۘܳ᩵;

.field public final ᩸:Z


# direct methods
.method public constructor <init>(Ll/ܺ֨ۗ;Ll/֫֨ۗ;ZLl/ۘܳ᩵;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/۬۫᩵;->ۙ:Ll/ܺ֨ۗ;

    .line 16
    iput-object p2, p0, Ll/۬۫᩵;->ۤ:Ll/֫֨ۗ;

    .line 17
    iput-boolean p3, p0, Ll/۬۫᩵;->᩸:Z

    .line 18
    iput-object p4, p0, Ll/۬۫᩵;->᩷:Ll/ۘܳ᩵;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TypeUpdateRequest{arg="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۬۫᩵;->ۙ:Ll/ܺ֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", candidateType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬۫᩵;->ۤ:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/ܺ֨ۗ;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/۬۫᩵;->ۙ:Ll/ܺ֨ۗ;

    return-object v0
.end method

.method public final ۤ()Ll/֫֨ۗ;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/۬۫᩵;->ۤ:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ۘܳ᩵;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/۬۫᩵;->᩷:Ll/ۘܳ᩵;

    return-object v0
.end method

.method public final ᩸()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Ll/۬۫᩵;->᩸:Z

    return v0
.end method
