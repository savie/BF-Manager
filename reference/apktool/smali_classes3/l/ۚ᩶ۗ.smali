.class public final Ll/ۚ᩶ۗ;
.super Ljava/lang/Object;
.source "2IV0"

# interfaces
.implements Ll/۫᩶ۗ;


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ۤ:Ll/ۤ᩶ۗ;

.field public final ᩷:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ll/ۤ᩶ۗ;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Ll/ۚ᩶ۗ;->ۤ:Ll/ۤ᩶ۗ;

    .line 12
    iput-object p2, p0, Ll/ۚ᩶ۗ;->ۙ:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Ll/ۚ᩶ۗ;->᩷:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final getVisibility()Ll/ۤ᩶ۗ;
    .locals 1

    .line 23
    iget-object v0, p0, Ll/ۚ᩶ۗ;->ۤ:Ll/ۤ᩶ۗ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Annotation{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۚ᩶ۗ;->ۤ:Ll/ۤ᩶ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۚ᩶ۗ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", values="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۚ᩶ۗ;->᩷:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ۚ᩶ۗ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ll/ܳ᩶ۗ;
    .locals 2

    .line 28
    iget-object v0, p0, Ll/ۚ᩶ۗ;->᩷:Ljava/util/LinkedHashMap;

    const-string v1, "value"

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܳ᩶ۗ;

    return-object v0
.end method

.method public final ᩷()Ljava/util/Map;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ۚ᩶ۗ;->᩷:Ljava/util/LinkedHashMap;

    return-object v0
.end method
