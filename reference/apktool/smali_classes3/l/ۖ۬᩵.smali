.class public final synthetic Ll/ۖ۬᩵;
.super Ll/ᩴۡ᩵;
.source "D97F"

# interfaces
.implements Ll/᩺֨᩵;


# static fields
.field public static final ۡ:Ll/ۖ۬᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 2
    new-instance v6, Ll/ۖ۬᩵;

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    const/4 v1, 0x2

    .line 0
    const-class v2, Ll/۠۬᩵;

    const-string v3, "createSegment"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ᩴۡ᩵;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v6, Ll/ۖ۬᩵;->ۡ:Ll/ۖ۬᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 2894
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    move-object v3, p2

    check-cast v3, Ll/ۤۙۨ;

    sget p1, Ll/۠۬᩵;->᩹:I

    .line 2896
    new-instance p1, Ll/ۤۙۨ;

    .line 2899
    invoke-virtual {v3}, Ll/ۤۙۨ;->ܺ()Ll/ۡ۬᩵;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p1

    .line 2896
    invoke-direct/range {v0 .. v5}, Ll/ۤۙۨ;-><init>(JLl/ۤۙۨ;Ll/ۡ۬᩵;I)V

    return-object p1
.end method
