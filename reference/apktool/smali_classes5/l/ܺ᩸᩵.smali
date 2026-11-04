.class public final Ll/ܺ᩸᩵;
.super Ljava/lang/Object;
.source "I6E5"

# interfaces
.implements Ll/᩶ۡۗ;


# instance fields
.field public ֡:Ll/֫֨ۗ;

.field public ۟:Ljava/util/List;

.field public ۢ:Z

.field public ܰ:I

.field public final ܿ:Ll/᩷ۢۗ;

.field public ᩳ:Ljava/util/List;

.field public ᩶:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/᩶ۡۗ;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    invoke-interface {p1}, Ll/᩶ۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩸᩵;->ܿ:Ll/᩷ۢۗ;

    .line 22
    invoke-interface {p1}, Ll/᩶ۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩸᩵;->֡:Ll/֫֨ۗ;

    .line 23
    invoke-interface {p1}, Ll/᩶ۡۗ;->ᩴ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩸᩵;->᩶:Ljava/util/List;

    .line 24
    invoke-interface {p1}, Ll/᩶ۡۗ;->᩸()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩸᩵;->ᩳ:Ljava/util/List;

    .line 25
    invoke-interface {p1}, Ll/᩶ۡۗ;->᩵()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩸᩵;->۟:Ljava/util/List;

    .line 26
    invoke-interface {p1}, Ll/᩶ۡۗ;->ۛ()Z

    move-result v0

    iput-boolean v0, p0, Ll/ܺ᩸᩵;->ۢ:Z

    .line 27
    invoke-interface {p1}, Ll/᩶ۡۗ;->᩶()I

    move-result p1

    iput p1, p0, Ll/ܺ᩸᩵;->ܰ:I

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Mutable"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܺ᩸᩵;->֡()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 2

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ܰۡۗ;->ۙ(Ll/᩶ۡۗ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " (mut)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 11
    sget-object v0, Ll/ۧ۟ۗ;->֡:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ(Ljava/util/ArrayList;)V
    .locals 0

    .line 65
    iput-object p1, p0, Ll/ܺ᩸᩵;->᩶:Ljava/util/List;

    return-void
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 0

    .line 61
    iput-object p1, p0, Ll/ܺ᩸᩵;->֡:Ll/֫֨ۗ;

    return-void
.end method

.method public final ۛ()Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Ll/ܺ᩸᩵;->ۢ:Z

    return v0
.end method

.method public final ۤ()Ll/֫֨ۗ;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ܺ᩸᩵;->֡:Ll/֫֨ۗ;

    return-object v0
.end method

.method public final ܺ()Ll/᩷ۢۗ;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ܺ᩸᩵;->ܿ:Ll/᩷ۢۗ;

    return-object v0
.end method

.method public final ᩴ()Ljava/util/List;
    .locals 1

    .line 42
    iget-object v0, p0, Ll/ܺ᩸᩵;->᩶:Ljava/util/List;

    return-object v0
.end method

.method public final ᩵()Ljava/util/List;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ܺ᩸᩵;->۟:Ljava/util/List;

    return-object v0
.end method

.method public final ᩶()I
    .locals 1

    .line 82
    iget v0, p0, Ll/ܺ᩸᩵;->ܰ:I

    return v0
.end method

.method public final ᩸()Ljava/util/List;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ܺ᩸᩵;->ᩳ:Ljava/util/List;

    return-object v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
