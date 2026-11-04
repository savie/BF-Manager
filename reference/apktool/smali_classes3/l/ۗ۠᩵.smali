.class public final Ll/ۗ۠᩵;
.super Ll/۠ۜ᩵;
.source "HAYQ"

# interfaces
.implements Ll/᩹۠᩵;


# instance fields
.field public final ۟:Ll/ܳ۬᩵;


# direct methods
.method public constructor <init>(Ll/ܳ۬᩵;)V
    .locals 0

    .line 1444
    invoke-direct {p0}, Ll/۠ۜ᩵;-><init>()V

    .line 1443
    iput-object p1, p0, Ll/ۗ۠᩵;->۟:Ll/ܳ۬᩵;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Throwable;)Z
    .locals 3

    .line 1447
    invoke-virtual {p0}, Ll/᩷۬᩵;->ۧ()Ll/ܳ۬᩵;

    move-result-object v0

    .line 661
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    .line 662
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܳ۬᩵;->ᩴ(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ll/ܳ۬᩵;->ᩴ()Z

    move-result p1

    if-eqz p1, :cond_1

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷(Ljava/lang/Throwable;)V
    .locals 1

    .line 1446
    iget-object p1, p0, Ll/ۗ۠᩵;->۟:Ll/ܳ۬᩵;

    invoke-virtual {p0}, Ll/᩷۬᩵;->ۧ()Ll/ܳ۬᩵;

    move-result-object v0

    .line 648
    invoke-virtual {p1, v0}, Ll/ܳ۬᩵;->ᩴ(Ljava/lang/Object;)Z

    return-void
.end method
