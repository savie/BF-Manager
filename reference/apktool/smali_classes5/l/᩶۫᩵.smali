.class public final synthetic Ll/᩶۫᩵;
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

    iput-object p1, p0, Ll/᩶۫᩵;->ۙ:Ll/ۢ۫᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۜ۫᩵;Ll/ᩳۡۗ;Ll/ܺ֨ۗ;Ll/֫֨ۗ;)Ll/ۙۚ᩵;
    .locals 2

    const/4 v0, 0x0

    .line 643
    invoke-virtual {p2, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    const/4 v1, 0x1

    .line 644
    invoke-virtual {p2, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p2

    if-ne v0, p3, :cond_0

    move-object v0, p2

    .line 646
    :cond_0
    new-instance p2, Ll/᩵۠᩻;

    invoke-direct {p2, v0, p4}, Ll/᩵۠᩻;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p3, p0, Ll/᩶۫᩵;->ۙ:Ll/ۢ۫᩵;

    invoke-virtual {p3, p1, v0, p4, p2}, Ll/ۢ۫᩵;->ۙ(Ll/ۜ۫᩵;Ll/ܺ֨ۗ;Ll/֫֨ۗ;Ll/ۘܳ᩵;)Ll/ۙۚ᩵;

    move-result-object p1

    return-object p1
.end method
