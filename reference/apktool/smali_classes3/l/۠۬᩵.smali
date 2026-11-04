.class public final Ll/۠۬᩵;
.super Ljava/lang/Object;
.source "D97F"


# static fields
.field public static final ֫:Ll/ۜ᩷ۨ;

.field public static final ۗ:Ll/ۜ᩷ۨ;

.field public static final ۙ:Ll/ۜ᩷ۨ;

.field public static final ۚ:Ll/ۜ᩷ۨ;

.field public static final ۤ:Ll/ۜ᩷ۨ;

.field public static final ۧ:Ll/ۜ᩷ۨ;

.field public static final ۫:Ll/ۜ᩷ۨ;

.field public static final ܳ:Ll/ۜ᩷ۨ;

.field public static final ܶ:Ll/ۜ᩷ۨ;

.field public static final ܺ:Ll/ۜ᩷ۨ;

.field public static final ܽ:Ll/ۜ᩷ۨ;

.field public static final ᩴ:Ll/ۜ᩷ۨ;

.field public static final ᩵:Ll/ۜ᩷ۨ;

.field public static final ᩷:Ll/ۜ᩷ۨ;

.field public static final ᩸:I

.field public static final ᩹:I

.field public static final ᩻:Ll/ۤۙۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 2902
    new-instance v6, Ll/ۤۙۨ;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/ۤۙۨ;-><init>(JLl/ۤۙۨ;Ll/ۡ۬᩵;I)V

    sput-object v6, Ll/۠۬᩵;->᩻:Ll/ۤۙۨ;

    const/16 v0, 0x20

    const/16 v1, 0xc

    const-string v2, "kotlinx.coroutines.bufferedChannel.segmentSize"

    .line 2908
    invoke-static {v0, v1, v2}, Ll/۬᩷ۨ;->ۙ(IILjava/lang/String;)I

    move-result v0

    sput v0, Ll/۠۬᩵;->᩹:I

    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v2, 0x2710

    .line 2915
    invoke-static {v2, v1, v0}, Ll/۬᩷ۨ;->ۙ(IILjava/lang/String;)I

    move-result v0

    sput v0, Ll/۠۬᩵;->᩸:I

    .line 2952
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "BUFFERED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ۙ:Ll/ۜ᩷ۨ;

    .line 2955
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ۚ:Ll/ۜ᩷ۨ;

    .line 2960
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ܶ:Ll/ۜ᩷ۨ;

    .line 2965
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ܽ:Ll/ۜ᩷ۨ;

    .line 2970
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "POISONED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ܺ:Ll/ۜ᩷ۨ;

    .line 2973
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ۤ:Ll/ۜ᩷ۨ;

    .line 2975
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->۫:Ll/ۜ᩷ۨ;

    .line 2977
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ܳ:Ll/ۜ᩷ۨ;

    .line 2979
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->᩷:Ll/ۜ᩷ۨ;

    .line 3009
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ۗ:Ll/ۜ᩷ۨ;

    .line 3010
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->᩵:Ll/ۜ᩷ۨ;

    .line 3011
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "FAILED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ᩴ:Ll/ۜ᩷ۨ;

    .line 3027
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->ۧ:Ll/ۜ᩷ۨ;

    .line 3042
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۠۬᩵;->֫:Ll/ۜ᩷ۨ;

    return-void
.end method

.method public static final synthetic ֫()Ll/ۤۙۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->᩻:Ll/ۤۙۨ;

    return-object v0
.end method

.method public static final synthetic ۙ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ۤ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static ۙ(Ll/ۧ۠᩵;Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x0

    .line 2925
    invoke-interface {p0, p1, v0}, Ll/ۧ۠᩵;->ۙ(Ljava/lang/Object;Ll/ۗ֨᩵;)Ll/ۜ᩷ۨ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2927
    invoke-interface {p0}, Ll/ۧ۠᩵;->᩸()V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final ۙ(Ll/ۧ۠᩵;Ljava/lang/Object;Ll/ۗ֨᩵;)Z
    .locals 0

    .line 2925
    invoke-interface {p0, p1, p2}, Ll/ۧ۠᩵;->ۙ(Ljava/lang/Object;Ll/ۗ֨᩵;)Ll/ۜ᩷ۨ;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2927
    invoke-interface {p0}, Ll/ۧ۠᩵;->᩸()V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final synthetic ۚ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ۧ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ۤ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ᩴ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ۧ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ܺ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ۫()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->֫:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ܳ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ۚ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ܶ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->᩵:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ܺ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ܶ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ܽ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ۗ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ᩴ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->۫:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ᩷()I
    .locals 1

    .line 1
    sget v0, Ll/۠۬᩵;->᩸:I

    return v0
.end method

.method public static final synthetic ᩸()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ܳ:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final ᩹()Ll/ۜ᩷ۨ;
    .locals 1

    .line 2979
    sget-object v0, Ll/۠۬᩵;->᩷:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final synthetic ᩻()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۠۬᩵;->ܽ:Ll/ۜ᩷ۨ;

    return-object v0
.end method
