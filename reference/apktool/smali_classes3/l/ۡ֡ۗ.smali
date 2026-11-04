.class public final Ll/ۡ֡ۗ;
.super Ljava/lang/Object;
.source "C6CM"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ۤ:Ll/֫֨ۗ;

.field public ᩷:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۛ֨ۗ;Ljava/lang/String;)V
    .locals 2

    .line 523
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 524
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "r"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۡ֡ۗ;->ۙ:Ljava/lang/String;

    .line 525
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ֡ۗ;->ۤ:Ll/֫֨ۗ;

    .line 526
    iput-object p2, p0, Ll/ۡ֡ۗ;->᩷:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۡ֡ۗ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֡ۗ;->ۙ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ۡ֡ۗ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡ֡ۗ;->᩷:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ۡ֡ۗ;)Ll/֫֨ۗ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֡ۗ;->ۤ:Ll/֫֨ۗ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۡ֡ۗ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ֡ۗ;->᩷:Ljava/lang/String;

    return-object p0
.end method
