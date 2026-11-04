.class public final Ll/ۗᩳۗ;
.super Ll/ܺ᩶ۗ;
.source "YIUA"


# instance fields
.field public final ܰ:Ljava/util/HashSet;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ljava/util/HashSet;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/ۗᩳۗ;->ܰ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "THROWS:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗᩳۗ;->ܰ:Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 32
    sget-object v0, Ll/ۧ۟ۗ;->֨:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/Set;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/ۗᩳۗ;->ܰ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x1

    .line 23
    iput-boolean v0, p0, Ll/ۗᩳۗ;->᩶:Z

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Ll/ۗᩳۗ;->᩶:Z

    return v0
.end method
