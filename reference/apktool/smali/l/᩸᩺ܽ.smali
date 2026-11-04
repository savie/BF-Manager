.class public final Ll/᩸᩺ܽ;
.super Ll/ܽۨܽ;
.source "26GL"


# instance fields
.field public final synthetic ۙ:Ll/ܽۨܽ;

.field public final synthetic ᩷:Ll/ܽۨܽ;


# direct methods
.method public constructor <init>(Ll/ܽۨܽ;Ll/ܽۨܽ;)V
    .locals 0

    .line 169
    iput-object p1, p0, Ll/᩸᩺ܽ;->ۙ:Ll/ܽۨܽ;

    iput-object p2, p0, Ll/᩸᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 6

    .line 172
    invoke-virtual {p1}, Ll/ۘܰܽ;->᩷()V

    const/4 v0, 0x0

    move-object v1, v0

    .line 175
    :goto_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v2

    sget-object v3, Ll/ܰܰܽ;->ۢ:Ll/ܰܰܽ;

    const-string v4, "dateTime"

    const-string v5, "offset"

    if-eq v2, v3, :cond_2

    .line 176
    invoke-virtual {p1}, Ll/ۘܰܽ;->֡()Ljava/lang/String;

    move-result-object v2

    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 186
    invoke-virtual {p1}, Ll/ۘܰܽ;->۠()V

    goto :goto_0

    .line 179
    :cond_0
    iget-object v0, p0, Ll/᩸᩺ܽ;->ۙ:Ll/ܽۨܽ;

    invoke-virtual {v0, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۤۗ;

    goto :goto_0

    .line 182
    :cond_1
    iget-object v1, p0, Ll/᩸᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {v1, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤ᩸ۗ;

    goto :goto_0

    .line 189
    :cond_2
    invoke-virtual {p1}, Ll/ۘܰܽ;->۫()V

    .line 191
    invoke-static {v0, v4, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    .line 192
    invoke-static {v1, v5, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    .line 190
    invoke-static {v0, v1}, Ll/ۡۤۗ;->of(Ll/ᩳۤۗ;Ll/ۤ᩸ۗ;)Ll/ۡۤۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 2

    .line 169
    check-cast p2, Ll/ۡۤۗ;

    .line 197
    invoke-virtual {p1}, Ll/᩶ܰܽ;->᩷()V

    const-string v0, "dateTime"

    .line 198
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Ll/᩸᩺ܽ;->ۙ:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/ۡۤۗ;->toLocalDateTime()Ll/ᩳۤۗ;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    const-string v0, "offset"

    .line 200
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 201
    iget-object v0, p0, Ll/᩸᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/ۡۤۗ;->getOffset()Ll/ۤ᩸ۗ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    .line 202
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܳ()V

    return-void
.end method
