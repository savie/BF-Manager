.class public final Ll/ۡۤ᩵;
.super Ll/֨ۤ᩵;
.source "OIS0"


# instance fields
.field public final ۤ:Ljava/util/List;

.field public final ᩷:Ll/֡᩷᩵;


# direct methods
.method public constructor <init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ljava/util/List;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Ll/֨ۤ᩵;-><init>(Ll/۟ۤ᩵;)V

    .line 20
    iput-object p2, p0, Ll/ۡۤ᩵;->᩷:Ll/֡᩷᩵;

    .line 21
    iput-object p3, p0, Ll/ۡۤ᩵;->ۤ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۚ()Ll/֡᩷᩵;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۡۤ᩵;->᩷:Ll/֡᩷᩵;

    return-object v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ۡۤ᩵;->ۤ:Ljava/util/List;

    return-object v0
.end method

.method public final ۫()Ll/ᩳۤ᩵;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ()Ll/ۧ᩸ۨ;
    .locals 2

    .line 26
    new-instance v0, Ll/᩻ۤ᩵;

    invoke-virtual {p0}, Ll/֨ۤ᩵;->ۤ()Ll/۟ۤ᩵;

    move-result-object v1

    .line 31
    invoke-direct {v0, v1}, Ll/ۙۤ᩵;-><init>(Ll/۟ۤ᩵;)V

    return-object v0
.end method

.method public final ᩷(Ll/۟ۤ᩵;)Ll/֨ۤ᩵;
    .locals 3

    .line 51
    iget-object v0, p0, Ll/ۡۤ᩵;->᩷:Ll/֡᩷᩵;

    invoke-virtual {v0}, Ll/֡᩷᩵;->ۙ()Ll/֡᩷᩵;

    move-result-object v0

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۡۤ᩵;->ۤ:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 53
    new-instance v2, Ll/ۡۤ᩵;

    invoke-direct {v2, p1, v0, v1}, Ll/ۡۤ᩵;-><init>(Ll/۟ۤ᩵;Ll/֡᩷᩵;Ljava/util/List;)V

    return-object v2
.end method

.method public final ᩸()Ll/ۢۤ᩵;
    .locals 1

    .line 31
    sget-object v0, Ll/ۢۤ᩵;->֡:Ll/ۢۤ᩵;

    return-object v0
.end method
