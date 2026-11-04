.class public final Ll/ܶۤ᩵;
.super Ll/֨ۤ᩵;
.source "Z6ER"


# instance fields
.field public final ۤ:Ljava/util/ArrayList;

.field public final ᩷:Ll/֡᩷᩵;

.field public final ᩸:Ll/᩷ۡۗ;


# direct methods
.method public constructor <init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ljava/util/ArrayList;Ll/᩷ۡۗ;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1}, Ll/֨ۤ᩵;-><init>(Ll/۟ۤ᩵;)V

    .line 47
    iput-object p3, p0, Ll/ܶۤ᩵;->ۤ:Ljava/util/ArrayList;

    .line 48
    iput-object p4, p0, Ll/ܶۤ᩵;->᩸:Ll/᩷ۡۗ;

    .line 49
    iput-object p2, p0, Ll/ܶۤ᩵;->᩷:Ll/֡᩷᩵;

    return-void
.end method

.method public static ۙ(Ll/֡᩷᩵;Ljava/util/ArrayList;Ll/᩷ۡۗ;)Ll/۬᩷᩵;
    .locals 1

    .line 17
    new-instance v0, Ll/ܽۤ᩵;

    invoke-direct {v0, p0, p1, p2}, Ll/ܽۤ᩵;-><init>(Ll/֡᩷᩵;Ljava/util/ArrayList;Ll/᩷ۡۗ;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۚ()Ll/֡᩷᩵;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܶۤ᩵;->᩷:Ll/֡᩷᩵;

    return-object v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ܶۤ᩵;->ۤ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۫()Ll/ᩳۤ᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ()Ll/ۧ᩸ۨ;
    .locals 2

    .line 54
    new-instance v0, Ll/֫ۤ᩵;

    invoke-virtual {p0}, Ll/֨ۤ᩵;->ۤ()Ll/۟ۤ᩵;

    move-result-object v1

    .line 113
    invoke-direct {v0, v1}, Ll/ۙۤ᩵;-><init>(Ll/۟ۤ᩵;)V

    return-object v0
.end method

.method public final ᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
    .locals 4

    .line 79
    new-instance v0, Ll/ܶۤ᩵;

    iget-object v1, p0, Ll/ܶۤ᩵;->ۤ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܶۤ᩵;->᩸:Ll/᩷ۡۗ;

    iget-object v3, p0, Ll/ܶۤ᩵;->᩷:Ll/֡᩷᩵;

    invoke-direct {v0, p1, v3, v1, v2}, Ll/ܶۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ljava/util/ArrayList;Ll/᩷ۡۗ;)V

    return-object v0
.end method

.method public final ᩸()Ll/ۢۤ᩵;
    .locals 1

    .line 59
    sget-object v0, Ll/ۢۤ᩵;->֡:Ll/ۢۤ᩵;

    return-object v0
.end method

.method public final ᩻()Ll/᩷ۡۗ;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ܶۤ᩵;->᩸:Ll/᩷ۡۗ;

    return-object v0
.end method
