.class public final Ll/᩵ᩴ᩵;
.super Ljava/lang/Object;
.source "96FJ"


# instance fields
.field public final ۙ:Ljava/util/HashSet;

.field public ᩷:Ll/᩵ۖۗ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩵ᩴ᩵;->ۙ:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>(Ll/᩵ᩴ᩵;Ll/᩵ۖۗ;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v0, Ljava/util/HashSet;

    iget-object p1, p1, Ll/᩵ᩴ᩵;->ۙ:Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll/᩵ᩴ᩵;->ۙ:Ljava/util/HashSet;

    .line 40
    iput-object p2, p0, Ll/᩵ᩴ᩵;->᩷:Ll/᩵ۖۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Region: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩵ᩴ᩵;->᩷:Ll/᩵ۖۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", exits: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩵ᩴ᩵;->ۙ:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/᩵ۖۗ;)Ll/᩵ᩴ᩵;
    .locals 1

    .line 44
    new-instance v0, Ll/᩵ᩴ᩵;

    invoke-direct {v0, p0, p1}, Ll/᩵ᩴ᩵;-><init>(Ll/᩵ᩴ᩵;Ll/᩵ۖۗ;)V

    return-object v0
.end method
