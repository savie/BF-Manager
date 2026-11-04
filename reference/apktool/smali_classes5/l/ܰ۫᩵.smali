.class public final synthetic Ll/ܰ۫᩵;
.super Ljava/lang/Object;
.source "B6I6"

# interfaces
.implements Ll/᩺ܳ᩵;


# instance fields
.field public final synthetic ۙ:Ll/ۢ۫᩵;


# direct methods
.method public synthetic constructor <init>(Ll/ۢ۫᩵;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ۫᩵;->ۙ:Ll/ۢ۫᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۜ۫᩵;Ll/ᩳۡۗ;Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;
    .locals 2

    const/4 v0, 0x0

    .line 614
    invoke-virtual {p2, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    const/4 v1, 0x2

    .line 615
    invoke-virtual {p2, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p2

    .line 616
    iget-object v1, p0, Ll/ܰ۫᩵;->ۙ:Ll/ۢ۫᩵;

    if-ne v0, p3, :cond_1

    .line 617
    invoke-virtual {p4}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object p3

    if-nez p3, :cond_0

    .line 619
    sget-object p1, Ll/ۙۚ᩵;->ܿ:Ll/ۙۚ᩵;

    return-object p1

    .line 621
    :cond_0
    new-instance p4, Ll/ᩳۢۤ;

    invoke-direct {p4, v1, p2, p3}, Ll/ᩳۢۤ;-><init>(Ll/ۢ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;)V

    invoke-virtual {v1, p1, p2, p3, p4}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object p1

    return-object p1

    :cond_1
    if-ne v0, p2, :cond_2

    .line 636
    invoke-static {p4}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {v1, p1, v0, p2, p3}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object p1

    return-object p1

    .line 639
    :cond_2
    sget-object p1, Ll/ۙۚ᩵;->֡:Ll/ۙۚ᩵;

    return-object p1
.end method
