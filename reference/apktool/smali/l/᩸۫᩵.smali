.class public final Ll/᩸۫᩵;
.super Ljava/lang/Object;
.source "6IT5"


# instance fields
.field public final ۙ:Ljava/util/LinkedHashSet;

.field public ᩷:Ll/֫֨ۗ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    sget-object v0, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    iput-object v0, p0, Ll/᩸۫᩵;->᩷:Ll/֫֨ۗ;

    .line 13
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/᩸۫᩵;->ۙ:Ljava/util/LinkedHashSet;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TypeInfo{type="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩸۫᩵;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bounds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩸۫᩵;->ۙ:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/util/LinkedHashSet;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/᩸۫᩵;->ۙ:Ljava/util/LinkedHashSet;

    return-object v0
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 0

    .line 21
    iput-object p1, p0, Ll/᩸۫᩵;->᩷:Ll/֫֨ۗ;

    return-void
.end method

.method public final ᩷()Ll/֫֨ۗ;
    .locals 1

    .line 17
    iget-object v0, p0, Ll/᩸۫᩵;->᩷:Ll/֫֨ۗ;

    return-object v0
.end method
