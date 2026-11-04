.class public final Ll/ۨ۠᩸;
.super Ll/ܽۚᩴ;
.source "X68P"


# instance fields
.field public final synthetic ۫:Ll/᩺ۜ᩸;


# direct methods
.method public constructor <init>(Ll/᩺ۜ᩸;Ll/᩶ۖ᩸;)V
    .locals 1

    .line 2508
    iput-object p1, p0, Ll/ۨ۠᩸;->۫:Ll/᩺ۜ᩸;

    const p1, 0x7f1201a6

    const v0, 0x7f0801fd

    invoke-direct {p0, p1, v0, p2}, Ll/ܽۚᩴ;-><init>(IILl/֨֨;)V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩺ۜ᩸;ZZII)Z
    .locals 0

    .line 2511
    iget-object p1, p0, Ll/ۨ۠᩸;->۫:Ll/᩺ۜ᩸;

    invoke-static {p1}, Ll/᩺ۜ᩸;->᩻(Ll/᩺ۜ᩸;)Ll/ܽ֡֫;

    move-result-object p3

    if-eqz p3, :cond_1

    if-eqz p2, :cond_1

    .line 9210
    iget-object p2, p1, Ll/᩺ۜ᩸;->۠᩸:Ll/֨ܽᩴ;

    iget-object p3, p1, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget-boolean p3, p3, Ll/ܰۤᩴ;->ۙۤ:Z

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Ll/֨ܽᩴ;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 9211
    invoke-virtual {p2, p4, p5}, Ll/֨ܽᩴ;->ۤ(II)Ll/ᩳܽᩴ;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 2512
    :goto_0
    invoke-static {p1, p2}, Ll/᩺ۜ᩸;->ۙ(Ll/᩺ۜ᩸;Ll/ᩳܽᩴ;)V

    .line 2513
    invoke-static {p1}, Ll/᩺ۜ᩸;->ܶۙ(Ll/᩺ۜ᩸;)Ll/ᩳܽᩴ;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Ll/᩺ۜ᩸;->ܶۙ(Ll/᩺ۜ᩸;)Ll/ᩳܽᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳܽᩴ;->ۤ()Ll/ۧ᩻ᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧ᩻ᩴ;->ۙ()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
