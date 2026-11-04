.class public final Ll/ۨ۟ۗ;
.super Ll/ܺ᩶ۗ;
.source "KIUQ"


# instance fields
.field public final ܰ:Ll/ᩳۡۗ;

.field public final ᩶:Ll/ۖۡۗ;


# direct methods
.method public constructor <init>(Ll/ۖۡۗ;Ll/ᩳۡۗ;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۨ۟ۗ;->᩶:Ll/ۖۡۗ;

    .line 17
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ll/ۨ۟ۗ;->ܰ:Ll/ᩳۡۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "INIT{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۨ۟ۗ;->ܰ:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 30
    sget-object v0, Ll/ۧ۟ۗ;->ܽ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ll/ᩳۡۗ;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/ۨ۟ۗ;->ܰ:Ll/ᩳۡۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ۖۡۗ;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/ۨ۟ۗ;->᩶:Ll/ۖۡۗ;

    return-object v0
.end method
