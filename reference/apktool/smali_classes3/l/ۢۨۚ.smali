.class public final Ll/ۢۨۚ;
.super Ljava/lang/Object;
.source "079R"


# instance fields
.field public final ۙ:Ll/֫۫ۚ;

.field public final ۤ:Z

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 50
    invoke-direct/range {v0 .. v5}, Ll/ۢۨۚ;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLl/֫۫ۚ;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZZLl/֫۫ۚ;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p5, p0, Ll/ۢۨۚ;->ۙ:Ll/֫۫ۚ;

    .line 61
    iput-object p1, p0, Ll/ۢۨۚ;->᩷:Ljava/lang/String;

    .line 62
    iput-object p2, p0, Ll/ۢۨۚ;->ᩴ:Ljava/lang/String;

    .line 63
    iput-boolean p3, p0, Ll/ۢۨۚ;->ۤ:Z

    .line 64
    iput-boolean p4, p0, Ll/ۢۨۚ;->᩸:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLl/֫۫ۚ;)V
    .locals 6

    xor-int/lit8 v3, p2, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move v4, p2

    move-object v5, p3

    .line 55
    invoke-direct/range {v0 .. v5}, Ll/ۢۨۚ;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLl/֫۫ۚ;)V

    return-void
.end method
