.class public final synthetic Ll/ܺ۫᩵;
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

    iput-object p1, p0, Ll/ܺ۫᩵;->ۙ:Ll/ۢ۫᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۜ۫᩵;Ll/ᩳۡۗ;Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;
    .locals 1

    .line 670
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    if-ne v0, p3, :cond_0

    const/4 p3, 0x0

    .line 454
    invoke-virtual {p2, p3}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p2

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object p2

    .line 455
    :goto_0
    invoke-virtual {p1, p2, p4}, Ll/ۜ۫᩵;->ۙ(Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 456
    sget-object p1, Ll/ۙۚ᩵;->᩶:Ll/ۙۚ᩵;

    return-object p1

    :cond_1
    const/4 p3, 0x0

    .line 458
    iget-object v0, p0, Ll/ܺ۫᩵;->ۙ:Ll/ۢ۫᩵;

    invoke-virtual {v0, p1, p2, p4, p3}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object p1

    return-object p1
.end method
