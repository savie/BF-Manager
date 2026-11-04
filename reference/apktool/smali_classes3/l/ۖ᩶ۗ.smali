.class public final Ll/ۖ᩶ۗ;
.super Ljava/lang/Object;
.source "ZIVU"

# interfaces
.implements Ll/۠ܰۗ;


# instance fields
.field public final ۙ:Ll/᩵ܺ᩵;

.field public final ᩷:Ll/᩷᩶ۗ;


# direct methods
.method public constructor <init>(Ll/᩷᩶ۗ;Ll/᩵ܺ᩵;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ll/ۖ᩶ۗ;->᩷:Ll/᩷᩶ۗ;

    .line 17
    iput-object p2, p0, Ll/ۖ᩶ۗ;->ۙ:Ll/᩵ܺ᩵;

    return-void
.end method


# virtual methods
.method public final getType()Ll/᩷᩶ۗ;
    .locals 1

    .line 22
    iget-object v0, p0, Ll/ۖ᩶ۗ;->᩷:Ll/᩷᩶ۗ;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۖ᩶ۗ;->᩷:Ll/᩷᩶ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۖ᩶ۗ;->ۙ:Ll/᩵ܺ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()V
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۖ᩶ۗ;->ۙ:Ll/᩵ܺ᩵;

    invoke-virtual {v0}, Ll/᩵ܺ᩵;->ۙ()V

    return-void
.end method

.method public final ۤ()Ll/۬ܰۗ;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/ۖ᩶ۗ;->ۙ:Ll/᩵ܺ᩵;

    return-object v0
.end method

.method public final bridge synthetic ᩷()Ll/֨ܰۗ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
