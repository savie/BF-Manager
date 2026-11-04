.class public final synthetic Ll/ۘ۫᩵;
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

    iput-object p1, p0, Ll/ۘ۫᩵;->ۙ:Ll/ۢ۫᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۜ۫᩵;Ll/ᩳۡۗ;Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;
    .locals 3

    .line 670
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    iget-object v1, p0, Ll/ۘ۫᩵;->ۙ:Ll/ۢ۫᩵;

    const/4 v2, 0x0

    if-ne v0, p3, :cond_0

    .line 575
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p3

    invoke-static {p4}, Ll/֫֨ۗ;->ۙ(Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    new-instance v2, Ll/ᩳۗۚ;

    invoke-direct {v2, v1, p2, p4}, Ll/ᩳۗۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, p3, v0, v2}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object p1

    return-object p1

    .line 589
    :cond_0
    invoke-virtual {p2, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    if-ne v0, p3, :cond_2

    .line 591
    invoke-virtual {p4}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object p3

    if-nez p3, :cond_1

    .line 593
    sget-object p1, Ll/ۙۚ᩵;->ܿ:Ll/ۙۚ᩵;

    return-object p1

    .line 595
    :cond_1
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p4

    new-instance v0, Ll/ۨ۫᩵;

    invoke-direct {v0, v1, p2, p3}, Ll/ۨ۫᩵;-><init>(Ll/ۢ۫᩵;Ll/ᩳۡۗ;Ll/֫֨ۗ;)V

    invoke-virtual {v1, p1, p4, p3, v0}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object p1

    return-object p1

    .line 610
    :cond_2
    sget-object p1, Ll/ۙۚ᩵;->֡:Ll/ۙۚ᩵;

    return-object p1
.end method
