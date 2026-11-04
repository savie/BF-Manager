.class public final Ll/ۤ᩹᩸;
.super Ljava/lang/Object;
.source "16RW"


# instance fields
.field public final ۙ:Landroid/os/Bundle;

.field public final ۤ:Ll/ۤ᩶᩸;

.field public final ᩴ:Ll/᩵ۤᩴ;

.field public final ᩷:Ll/ܶ۬᩸;

.field public ᩸:J


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;Ll/ܶ᩵᩸;Ll/᩺ۜ᩸;)V
    .locals 10

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iget-object p2, p2, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {p2}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤ᩹᩸;->᩸:J

    .line 89
    new-instance p2, Landroid/os/Bundle;

    iget-object v0, p1, Ll/ۜܽ᩸;->ܰ:Landroid/os/Bundle;

    invoke-direct {p2, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p2, p0, Ll/ۤ᩹᩸;->ۙ:Landroid/os/Bundle;

    .line 90
    invoke-virtual {p1}, Ll/۟ܰ᩸;->۟()Ll/᩸᩶᩸;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    goto :goto_3

    .line 99
    :cond_0
    new-instance v9, Ll/ۤ᩶᩸;

    iget v2, p2, Ll/᩸᩶᩸;->۫:I

    iget v3, p2, Ll/᩸᩶᩸;->ۤ:I

    iget-boolean v4, p2, Ll/᩸᩶᩸;->ᩴ:Z

    iget v5, p2, Ll/᩸᩶᩸;->ܳ:I

    .line 100
    iget-object v1, p2, Ll/᩸᩶᩸;->ۙ:Ll/᩷ۨᩴ;

    if-nez v1, :cond_1

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p2, Ll/᩸᩶᩸;->᩷:Ll/᩶ۤۤ;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    const/4 v7, 0x0

    :goto_2
    iget-object v8, p2, Ll/᩸᩶᩸;->᩸:Ljava/util/Map;

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ll/ۤ᩶᩸;-><init>(IIZILjava/lang/String;ZLjava/util/Map;)V

    move-object v0, v9

    .line 91
    :goto_3
    iput-object v0, p0, Ll/ۤ᩹᩸;->ۤ:Ll/ۤ᩶᩸;

    .line 92
    invoke-virtual {p3}, Ll/᩺ۜ᩸;->֡()Ll/᩵ۤᩴ;

    move-result-object p2

    iput-object p2, p0, Ll/ۤ᩹᩸;->ᩴ:Ll/᩵ۤᩴ;

    .line 93
    iget-object p1, p1, Ll/۟ܰ᩸;->ۜ:Ll/᩹۬᩸;

    invoke-virtual {p1}, Ll/᩹۬᩸;->ۤ()Ll/ܶ۬᩸;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩹᩸;->᩷:Ll/ܶ۬᩸;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۤ᩹᩸;)Z
    .locals 7

    if-eqz p1, :cond_4

    .line 97
    iget-object v0, p1, Ll/ۤ᩹᩸;->ۤ:Ll/ۤ᩶᩸;

    iget-object v1, p1, Ll/ۤ᩹᩸;->ۙ:Landroid/os/Bundle;

    iget-wide v2, p0, Ll/ۤ᩹᩸;->᩸:J

    iget-wide v4, p1, Ll/ۤ᩹᩸;->᩸:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_4

    iget-object v2, p0, Ll/ۤ᩹᩸;->ᩴ:Ll/᩵ۤᩴ;

    iget-object v3, p1, Ll/ۤ᩹᩸;->ᩴ:Ll/᩵ۤᩴ;

    invoke-virtual {v2, v3}, Ll/᩵ۤᩴ;->ۙ(Ll/᩵ۤᩴ;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Ll/ۤ᩹᩸;->᩷:Ll/ܶ۬᩸;

    iget-object p1, p1, Ll/ۤ᩹᩸;->᩷:Ll/ܶ۬᩸;

    invoke-virtual {v2, p1}, Ll/ܶ۬᩸;->ۙ(Ll/ܶ۬᩸;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Ll/ۤ᩹᩸;->ۤ:Ll/ۤ᩶᩸;

    if-nez p1, :cond_0

    if-nez v0, :cond_4

    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {p1, v0}, Ll/ۤ᩶᩸;->ۙ(Ll/ۤ᩶᩸;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 99
    :goto_0
    iget-object p1, p0, Ll/ۤ᩹᩸;->ۙ:Landroid/os/Bundle;

    invoke-virtual {p1}, Landroid/os/BaseBundle;->size()I

    move-result v0

    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    move-result v2

    if-eq v0, v2, :cond_1

    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 101
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v2}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1
.end method
