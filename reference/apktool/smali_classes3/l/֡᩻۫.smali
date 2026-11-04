.class public final Ll/֡᩻۫;
.super Ll/ܿ᩵ܳ;
.source "22BV"


# instance fields
.field public final synthetic ᩸:Ll/ۜ᩻۫;


# direct methods
.method public constructor <init>(Ll/ۜ᩻۫;)V
    .locals 1

    .line 893
    iput-object p1, p0, Ll/֡᩻۫;->᩸:Ll/ۜ᩻۫;

    const p1, 0x7f12076a

    const v0, 0x7f0801eb

    invoke-direct {p0, p1, v0}, Ll/ܿ᩵ܳ;-><init>(II)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۠ۨܳ;)V
    .locals 3

    .line 896
    invoke-virtual {p1}, Ll/۠ۨܳ;->ۗ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/۠ۨܳ;->۟()Ll/ᩴ᩶ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩴ᩶ܳ;->ܺ()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ll/᩸ܿܳ;->ۙ(Ljava/lang/String;Ll/۠᩶ܳ;I)V

    .line 897
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ܳ۫;->ۙ(Lbin/mt/plus/Main;)V

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    .line 902
    iget-object v0, p0, Ll/֡᩻۫;->᩸:Ll/ۜ᩻۫;

    invoke-virtual {v0}, Ll/ۜ᩻۫;->ᩳ()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
