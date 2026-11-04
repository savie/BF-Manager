.class public final Ll/ۡᩴ᩵;
.super Ljava/lang/Object;
.source "Y6FO"


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public final ۤ:Ll/ܿ֨ۗ;

.field public final ᩷:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ܿ֨ۗ;)V
    .locals 2

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۡᩴ᩵;->ۙ:Ljava/util/ArrayList;

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۡᩴ᩵;->᩷:Ljava/util/ArrayList;

    .line 14
    iput-object p1, p0, Ll/ۡᩴ᩵;->ۤ:Ll/ܿ֨ۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۡᩴ᩵;->ۤ:Ll/ܿ֨ۗ;

    if-nez v1, :cond_0

    const-string v1, "-"

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ܿ֨ۗ;->֡()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", a:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡᩴ᩵;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", u:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۡᩴ᩵;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/util/ArrayList;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۡᩴ᩵;->ۙ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۤ()Ll/ܿ֨ۗ;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ۡᩴ᩵;->ۤ:Ll/ܿ֨ۗ;

    return-object v0
.end method

.method public final ᩷()Ljava/util/ArrayList;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ۡᩴ᩵;->᩷:Ljava/util/ArrayList;

    return-object v0
.end method
