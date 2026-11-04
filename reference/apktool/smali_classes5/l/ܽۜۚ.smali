.class public final Ll/ܽۜۚ;
.super Ll/۫ܺۙ;
.source "X8B6"


# instance fields
.field public ֡:Z

.field public ֨:Z

.field public ۖ:Ljava/lang/String;

.field public final ۜ:Ljava/util/HashSet;

.field public ۟:Ljava/lang/String;

.field public final ۠:Ljava/util/ArrayList;

.field public ۡ:Ll/᩷ۨᩴ;

.field public ۢ:Landroid/net/Uri;

.field public ۬:Landroid/os/Bundle;

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩶:Ll/ۨۜۚ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 130
    invoke-direct {p0}, Ll/۫ܺۙ;-><init>()V

    .line 132
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܽۜۚ;->۠:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 137
    iput-boolean v0, p0, Ll/ܽۜۚ;->ܿ:Z

    return-void
.end method

.method private ᩴ()V
    .locals 3

    .line 155
    iget-object v0, p0, Ll/ܽۜۚ;->ۡ:Ll/᩷ۨᩴ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, ".xml"

    .line 156
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܶۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܽۜۚ;->ۡ:Ll/᩷ۨᩴ;

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".arsc"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {v0, v2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 157
    :cond_0
    iget-object v0, p0, Ll/ܽۜۚ;->ۡ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ᩳ()Z

    .line 158
    iput-object v1, p0, Ll/ܽۜۚ;->ۡ:Ll/᩷ۨᩴ;

    .line 160
    :cond_1
    iput-object v1, p0, Ll/ܽۜۚ;->ۖ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ۤ()V
    .locals 0

    .line 164
    invoke-direct {p0}, Ll/ܽۜۚ;->ᩴ()V

    return-void
.end method

.method public final ᩸()V
    .locals 2

    .line 143
    invoke-direct {p0}, Ll/ܽۜۚ;->ᩴ()V

    const/4 v0, 0x0

    .line 144
    iput-object v0, p0, Ll/ܽۜۚ;->᩶:Ll/ۨۜۚ;

    .line 145
    iget-object v1, p0, Ll/ܽۜۚ;->ۜ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    .line 146
    iget-object v1, p0, Ll/ܽۜۚ;->۠:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 147
    iput-object v0, p0, Ll/ܽۜۚ;->۟:Ljava/lang/String;

    .line 148
    iput-object v0, p0, Ll/ܽۜۚ;->ۢ:Landroid/net/Uri;

    .line 149
    iput-object v0, p0, Ll/ܽۜۚ;->۬:Landroid/os/Bundle;

    const/4 v0, 0x0

    .line 150
    iput-boolean v0, p0, Ll/ܽۜۚ;->ᩳ:Z

    const/4 v0, 0x1

    .line 151
    iput-boolean v0, p0, Ll/ܽۜۚ;->ܿ:Z

    return-void
.end method
