.class public final Ll/᩷᩺ܽ;
.super Ll/ܽۨܽ;
.source "26GL"


# instance fields
.field public final synthetic ۙ:Ll/ܽۨܽ;

.field public final synthetic ᩷:Ll/ܽۨܽ;


# direct methods
.method public constructor <init>(Ll/ܽۨܽ;Ll/ܽۨܽ;)V
    .locals 0

    .line 116
    iput-object p1, p0, Ll/᩷᩺ܽ;->ۙ:Ll/ܽۨܽ;

    iput-object p2, p0, Ll/᩷᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-direct {p0}, Ll/ܽۨܽ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;
    .locals 6

    .line 121
    invoke-virtual {p1}, Ll/ۘܰܽ;->᩷()V

    const/4 v0, 0x0

    move-object v1, v0

    .line 122
    :goto_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v2

    sget-object v3, Ll/ܰܰܽ;->ۢ:Ll/ܰܰܽ;

    const-string v4, "time"

    const-string v5, "date"

    if-eq v2, v3, :cond_2

    .line 123
    invoke-virtual {p1}, Ll/ۘܰܽ;->֡()Ljava/lang/String;

    move-result-object v2

    .line 124
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 133
    invoke-virtual {p1}, Ll/ۘܰܽ;->۠()V

    goto :goto_0

    .line 129
    :cond_0
    iget-object v1, p0, Ll/᩷᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {v1, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۢۤۗ;

    goto :goto_0

    .line 126
    :cond_1
    iget-object v0, p0, Ll/᩷᩺ܽ;->ۙ:Ll/ܽۨܽ;

    invoke-virtual {v0, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ۤۗ;

    goto :goto_0

    .line 136
    :cond_2
    invoke-virtual {p1}, Ll/ۘܰܽ;->۫()V

    .line 138
    invoke-static {v0, v5, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    invoke-static {v1, v4, p1}, Ll/۫᩺ܽ;->ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V

    .line 137
    invoke-static {v0, v1}, Ll/ᩳۤۗ;->of(Ll/۟ۤۗ;Ll/ۢۤۗ;)Ll/ᩳۤۗ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    .locals 2

    .line 116
    check-cast p2, Ll/ᩳۤۗ;

    .line 143
    invoke-virtual {p1}, Ll/᩶ܰܽ;->᩷()V

    const-string v0, "date"

    .line 144
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 145
    iget-object v0, p0, Ll/᩷᩺ܽ;->ۙ:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/ᩳۤۗ;->toLocalDate()Ll/۟ۤۗ;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    const-string v0, "time"

    .line 146
    invoke-virtual {p1, v0}, Ll/᩶ܰܽ;->ۙ(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Ll/᩷᩺ܽ;->᩷:Ll/ܽۨܽ;

    invoke-virtual {p2}, Ll/ᩳۤۗ;->toLocalTime()Ll/ۢۤۗ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V

    .line 148
    invoke-virtual {p1}, Ll/᩶ܰܽ;->ܳ()V

    return-void
.end method
