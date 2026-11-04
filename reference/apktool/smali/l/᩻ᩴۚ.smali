.class public final Ll/᩻ᩴۚ;
.super Ljava/lang/Object;
.source "C7AH"


# instance fields
.field public final ۙ:J

.field public final ۤ:Ll/ܿ᩻ܳ;

.field public final ᩷:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ll/ܿ᩻ܳ;Ljava/lang/String;J)V
    .locals 0

    .line 460
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 461
    iput-object p1, p0, Ll/᩻ᩴۚ;->ۤ:Ll/ܿ᩻ܳ;

    .line 462
    iput-object p2, p0, Ll/᩻ᩴۚ;->᩷:Ljava/lang/String;

    .line 463
    iput-wide p3, p0, Ll/᩻ᩴۚ;->ۙ:J

    return-void
.end method

.method public static ۙ(Ll/᩻ᩴۚ;)Ll/ܿ᩻ܳ;
    .locals 0

    .line 494
    iget-object p0, p0, Ll/᩻ᩴۚ;->ۤ:Ll/ܿ᩻ܳ;

    return-object p0
.end method

.method public static ۙ(JLjava/lang/String;)Ll/᩻ᩴۚ;
    .locals 2

    .line 468
    new-instance v0, Ll/᩻ᩴۚ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2, p0, p1}, Ll/᩻ᩴۚ;-><init>(Ll/ܿ᩻ܳ;Ljava/lang/String;J)V

    return-object v0
.end method

.method public static ۙ(Ll/ܿ᩻ܳ;)Ll/᩻ᩴۚ;
    .locals 4

    .line 480
    new-instance v0, Ll/᩻ᩴۚ;

    const-string v1, ""

    const-wide/16 v2, 0x0

    .line 457
    invoke-direct {v0, p0, v1, v2, v3}, Ll/᩻ᩴۚ;-><init>(Ll/ܿ᩻ܳ;Ljava/lang/String;J)V

    return-object v0
.end method

.method public static ᩷(Ll/᩻ᩴۚ;)Z
    .locals 0

    .line 487
    iget-object p0, p0, Ll/᩻ᩴۚ;->ۤ:Ll/ܿ᩻ܳ;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
