.class public final Ll/᩸ܳۚ;
.super Ljava/lang/Object;
.source "3IXR"


# static fields
.field public static final ᩴ:Ljava/lang/ThreadLocal;


# instance fields
.field public final ۙ:J

.field public final ۤ:I

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ll/ۗ᩻ܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 7
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/᩸ܳۚ;->ᩴ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Ll/ۗ᩻ܳ;Ll/᩻ᩴۚ;I)V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ll/᩸ܳۚ;->᩸:Ll/ۗ᩻ܳ;

    .line 16
    iput p3, p0, Ll/᩸ܳۚ;->ۤ:I

    .line 17
    iget-object p1, p2, Ll/᩻ᩴۚ;->᩷:Ljava/lang/String;

    iput-object p1, p0, Ll/᩸ܳۚ;->᩷:Ljava/lang/String;

    .line 18
    iget-wide p1, p2, Ll/᩻ᩴۚ;->ۙ:J

    iput-wide p1, p0, Ll/᩸ܳۚ;->ۙ:J

    return-void
.end method

.method public static ۙ()Ll/᩸ܳۚ;
    .locals 2

    .line 35
    sget-object v0, Ll/᩸ܳۚ;->ᩴ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸ܳۚ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "TRANSFER_CONTEXT_REQUIRED"

    const-string v1, "An authenticated HTTP request is required."

    .line 36
    invoke-static {v0, v1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0
.end method

.method public static ۙ(Ll/ۗ᩻ܳ;Ll/᩻ᩴۚ;I)Ll/᩸ܳۚ;
    .locals 3

    .line 23
    sget-object v0, Ll/᩸ܳۚ;->ᩴ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ܳۚ;

    .line 24
    new-instance v2, Ll/᩸ܳۚ;

    invoke-direct {v2, p0, p1, p2}, Ll/᩸ܳۚ;-><init>(Ll/ۗ᩻ܳ;Ll/᩻ᩴۚ;I)V

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v1
.end method

.method public static ۙ(Ll/᩸ܳۚ;)V
    .locals 1

    .line 29
    sget-object v0, Ll/᩸ܳۚ;->ᩴ:Ljava/lang/ThreadLocal;

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    return-void

    .line 30
    :cond_0
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
