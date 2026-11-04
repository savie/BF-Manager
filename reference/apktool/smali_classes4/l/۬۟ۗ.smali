.class public final Ll/۬۟ۗ;
.super Ll/ܺ᩶ۗ;
.source "H6ER"


# instance fields
.field public final ܰ:Ljava/lang/Object;

.field public final ᩶:Ll/ۜ۟ۗ;


# direct methods
.method public constructor <init>(Ll/֨ᩳۗ;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    sget-object v0, Ll/ۜ۟ۗ;->᩶:Ll/ۜ۟ۗ;

    iput-object v0, p0, Ll/۬۟ۗ;->᩶:Ll/ۜ۟ۗ;

    .line 20
    iput-object p1, p0, Ll/۬۟ۗ;->ܰ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ܺ֨ۗ;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    sget-object v0, Ll/ۜ۟ۗ;->ܿ:Ll/ۜ۟ۗ;

    iput-object v0, p0, Ll/۬۟ۗ;->᩶:Ll/ۜ۟ۗ;

    .line 25
    iput-object p1, p0, Ll/۬۟ۗ;->ܰ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "REPLACE: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/۬۟ۗ;->᩶:Ll/ۜ۟ۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۬۟ۗ;->ܰ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 8
    sget-object v0, Ll/ۧ۟ۗ;->ܶ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ll/֨ᩳۗ;
    .locals 1

    .line 33
    iget-object v0, p0, Ll/۬۟ۗ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/֨ᩳۗ;

    return-object v0
.end method

.method public final ܳ()Ll/ܺ֨ۗ;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/۬۟ۗ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ܺ֨ۗ;

    return-object v0
.end method

.method public final ᩷()Ll/ۜ۟ۗ;
    .locals 1

    .line 29
    iget-object v0, p0, Ll/۬۟ۗ;->᩶:Ll/ۜ۟ۗ;

    return-object v0
.end method
