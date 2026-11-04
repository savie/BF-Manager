.class public final Ll/ᩳ᩶ۗ;
.super Ljava/lang/Object;
.source "J55P"


# instance fields
.field public final ۙ:Ljava/util/List;

.field public final ᩷:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/HashMap;Ljava/util/ArrayList;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/ᩳ᩶ۗ;->᩷:Ljava/util/Map;

    .line 16
    iput-object p2, p0, Ll/ᩳ᩶ۗ;->ۙ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DebugInfo{lines="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩳ᩶ۗ;->᩷:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", localVars="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ᩳ᩶ۗ;->ۙ:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/ᩳ᩶ۗ;->ۙ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩷()Ljava/util/Map;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ᩳ᩶ۗ;->᩷:Ljava/util/Map;

    return-object v0
.end method
