.class public final Ll/ۚ֫ܳ;
.super Ljava/lang/Object;
.source "R6JU"

# interfaces
.implements Ll/֡֨֫;


# instance fields
.field public final synthetic ܰ:Ll/ܽ֫ܳ;


# direct methods
.method public constructor <init>(Ll/ܽ֫ܳ;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ֫ܳ;->ܰ:Ll/ܽ֫ܳ;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ۚ֫ܳ;->ܰ:Ll/ܽ֫ܳ;

    invoke-static {v0}, Ll/ܽ֫ܳ;->᩸(Ll/ܽ֫ܳ;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 3

    .line 109
    iget-object v0, p0, Ll/ۚ֫ܳ;->ܰ:Ll/ܽ֫ܳ;

    invoke-static {v0}, Ll/ܽ֫ܳ;->᩷(Ll/ܽ֫ܳ;)Ll/᩻֫ܳ;

    move-result-object v0

    .line 110
    iget-object v1, p0, Ll/ۚ֫ܳ;->ܰ:Ll/ܽ֫ܳ;

    invoke-static {v1}, Ll/ܽ֫ܳ;->᩸(Ll/ܽ֫ܳ;)V

    if-eqz v0, :cond_1

    .line 111
    iget-object v1, p0, Ll/ۚ֫ܳ;->ܰ:Ll/ܽ֫ܳ;

    invoke-static {v1}, Ll/ܽ֫ܳ;->ۙ(Ll/ܽ֫ܳ;)Ll/᩻֫ܳ;

    move-result-object v1

    if-ne v1, v0, :cond_1

    iget-boolean v1, v0, Ll/᩻֫ܳ;->ۙ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 112
    :cond_0
    iput-object p1, v0, Ll/᩻֫ܳ;->ᩴ:Ljava/lang/String;

    .line 113
    sget-object v1, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    invoke-interface {v1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v1

    const-string v2, "hpdd"

    invoke-interface {v1, v2, p1}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳ֫ܺ;->apply()V

    .line 114
    iget-object v1, v0, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    invoke-virtual {v1, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 115
    iget-object p1, v0, Ll/᩻֫ܳ;->ܳ:Ll/᩹ۖ᩸;

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩹ۖ᩸;->᩹(I)V

    :cond_1
    :goto_0
    return-void
.end method
