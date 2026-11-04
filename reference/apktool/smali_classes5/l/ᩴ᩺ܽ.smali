.class public final Ll/ᩴ᩺ܽ;
.super Ll/ܽۨܽ;
.source "26GL"


# instance fields
.field public final synthetic ۙ:Ll/ܽۨܽ;

.field public final synthetic ᩷:Ll/ܽۨܽ;


# direct methods
.method public constructor <init>(Ll/ܽۨܽ;Ll/ܽۨܽ;)V
    .locals 0

    .line 210
    iput-object p1, p0, Ll/ᩴ᩺ܽ;->ۙ:Ll/ܽۨܽ;

    iput-object p2, p0, Ll/ᩴ᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 6

    .line 213
    invoke-virtual {p1}, Ll/ۘܰܽ;->᩷()V

    const/4 v0, 0x0

    move-object v1, v0

    .line 216
    :goto_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v2

    sget-object v3, Ll/ܰܰܽ;->ۢ:Ll/ܰܰܽ;

    const-string v4, "time"

    const-string v5, "offset"

    if-eq v2, v3, :cond_2

    .line 217
    invoke-virtual {p1}, Ll/ۘܰܽ;->֡()Ljava/lang/String;

    move-result-object v2

    .line 218
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 227
    invoke-virtual {p1}, Ll/ۘܰܽ;->۠()V

    goto :goto_0

    .line 220
    :cond_0
    iget-object v0, p0, Ll/ᩴ᩺ܽ;->ۙ:Ll/ܽۨܽ;

    invoke-virtual {v0, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۤۗ;

    goto :goto_0

    .line 223
    :cond_1
    iget-object v1, p0, Ll/ᩴ᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {v1, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ᩸ۗ;

    goto :goto_0

    .line 230
    :cond_2
    invoke-virtual {p1}, Ll/ۘܰܽ;->۫()V

    .line 232
    invoke-static {v0, v4, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    .line 233
    invoke-static {v1, v5, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    .line 231
    invoke-static {v0, v1}, Ll/ۖۤۗ;->of(Ll/ۢۤۗ;Ll/ۤ᩸ۗ;)Ll/ۖۤۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 2

    .line 210
    check-cast p2, Ll/ۖۤۗ;

    .line 238
    invoke-virtual {p1}, Ll/᩶ܰܽ;->᩷()V

    const-string v0, "time"

    .line 239
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 240
    iget-object v0, p0, Ll/ᩴ᩺ܽ;->ۙ:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/ۖۤۗ;->toLocalTime()Ll/ۢۤۗ;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    const-string v0, "offset"

    .line 241
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 242
    iget-object v0, p0, Ll/ᩴ᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/ۖۤۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    .line 243
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܳ()V

    return-void
.end method
