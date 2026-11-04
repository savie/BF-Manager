.class public final Ll/ᩴᩴ᩵;
.super Ljava/lang/Object;
.source "26FQ"


# instance fields
.field public final ۙ:Ll/᩷ۡۗ;

.field public final ۤ:Ljava/lang/Object;

.field public final ᩷:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Integer;Ll/᩷ۡۗ;)V
    .locals 0

    .line 516
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 517
    iput-object p1, p0, Ll/ᩴᩴ᩵;->ۤ:Ljava/lang/Object;

    .line 518
    iput-object p3, p0, Ll/ᩴᩴ᩵;->ۙ:Ll/᩷ۡۗ;

    .line 519
    iput-object p2, p0, Ll/ᩴᩴ᩵;->᩷:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 536
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CaseData{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩴᩴ᩵;->ۤ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/᩷ۡۗ;
    .locals 1

    .line 527
    iget-object v0, p0, Ll/ᩴᩴ᩵;->ۙ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۤ()Ljava/lang/Object;
    .locals 1

    .line 523
    iget-object v0, p0, Ll/ᩴᩴ᩵;->ۤ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/Integer;
    .locals 1

    .line 531
    iget-object v0, p0, Ll/ᩴᩴ᩵;->᩷:Ljava/lang/Integer;

    return-object v0
.end method
