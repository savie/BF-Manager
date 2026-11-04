.class public final Ll/ܳ۫᩵;
.super Ll/᩸ܳ᩵;
.source "O6FE"


# instance fields
.field public final synthetic ۤ:Ll/֫۫᩵;


# direct methods
.method public constructor <init>(Ll/֫۫᩵;Ll/ᩳۡۗ;Ll/ۛ֨ۗ;)V
    .locals 0

    .line 376
    iput-object p1, p0, Ll/ܳ۫᩵;->ۤ:Ll/֫۫᩵;

    invoke-direct {p0, p2, p3}, Ll/᩸ܳ᩵;-><init>(Ll/ᩳۡۗ;Ll/ܺ֨ۗ;)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۧ۫᩵;)Z
    .locals 3

    .line 379
    iget-object v0, p0, Ll/᩸ܳ᩵;->ۙ:Ll/ᩳۡۗ;

    invoke-virtual {v0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ۧ۫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v1

    const/4 v2, 0x0

    .line 380
    invoke-virtual {v0, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۧ۫᩵;->ۙ(Ll/ܺ֨ۗ;)Ll/֫֨ۗ;

    move-result-object p1

    .line 381
    iget-object v0, p0, Ll/ܳ۫᩵;->ۤ:Ll/֫۫᩵;

    invoke-static {v0}, Ll/֫۫᩵;->ۙ(Ll/֫۫᩵;)Ll/۠ܳ᩵;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Ll/۠ܳ᩵;->ۙ(Ll/֫֨ۗ;Ll/֫֨ۗ;)Ll/ۜܳ᩵;

    move-result-object p1

    .line 382
    invoke-virtual {p1}, Ll/ۜܳ᩵;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ll/ۜܳ᩵;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
