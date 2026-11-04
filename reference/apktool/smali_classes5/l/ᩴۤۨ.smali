.class public final Ll/ᩴۤۨ;
.super Ljava/lang/Object;
.source "BAYE"


# static fields
.field public static final ۙ:Ll/ۜ᩷ۨ;

.field public static final ۤ:Ll/᩺֨᩵;

.field public static final ᩷:Ll/᩺֨᩵;

.field public static final ᩸:Ll/᩺֨᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 7
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ᩴۤۨ;->ۙ:Ll/ۜ᩷ۨ;

    return-void
.end method

.method public static final ۙ(Ll/ۧۢ᩵;Ljava/lang/Object;)V
    .locals 2

    .line 81
    sget-object v0, Ll/ᩴۤۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-ne p1, v0, :cond_0

    return-void

    .line 82
    :cond_0
    instance-of v0, p1, Ll/ۚۤۨ;

    if-eqz v0, :cond_1

    .line 84
    check-cast p1, Ll/ۚۤۨ;

    invoke-virtual {p1, p0}, Ll/ۚۤۨ;->ۙ(Ll/ۧۢ᩵;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 89
    sget-object v1, Ll/ۤۤۨ;->᩶:Ll/ۤۤۨ;

    invoke-interface {p0, v0, v1}, Ll/ۧۢ᩵;->ۙ(Ljava/lang/Object;Ll/᩺֨᩵;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ll/ܶ۬᩵;

    .line 90
    invoke-interface {p0, p1}, Ll/ܶ۬᩵;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public static final ᩷(Ll/ۧۢ᩵;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-nez p1, :cond_0

    sget-object p1, Ll/᩷ۤۨ;->᩶:Ll/᩷ۤۨ;

    invoke-interface {p0, v0, p1}, Ll/ۧۢ᩵;->ۙ(Ljava/lang/Object;Ll/᩺֨᩵;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    :cond_0
    if-ne p1, v0, :cond_1

    .line 64
    sget-object p0, Ll/ᩴۤۨ;->ۙ:Ll/ۜ᩷ۨ;

    return-object p0

    .line 66
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 68
    new-instance v0, Ll/ۚۤۨ;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p1, p0}, Ll/ۚۤۨ;-><init>(ILl/ۧۢ᩵;)V

    sget-object p1, Ll/᩸ۤۨ;->᩶:Ll/᩸ۤۨ;

    invoke-interface {p0, v0, p1}, Ll/ۧۢ᩵;->ۙ(Ljava/lang/Object;Ll/᩺֨᩵;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 73
    :cond_2
    check-cast p1, Ll/ܶ۬᩵;

    .line 74
    invoke-interface {p1, p0}, Ll/ܶ۬᩵;->᩷(Ll/ۧۢ᩵;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
