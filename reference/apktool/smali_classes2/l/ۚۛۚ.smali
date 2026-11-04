.class public final Ll/ۚۛۚ;
.super Ljava/lang/Object;
.source "87AO"


# instance fields
.field public final ۙ:[B

.field public final ۤ:Z

.field public final ᩴ:J

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ll/᩷ۨᩴ;


# direct methods
.method public constructor <init>(JLl/᩷ۨᩴ;Ljava/lang/String;Z)V
    .locals 0

    .line 1085
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1087
    iput-object p4, p0, Ll/ۚۛۚ;->᩷:Ljava/lang/String;

    const/4 p4, 0x0

    .line 1088
    iput-object p4, p0, Ll/ۚۛۚ;->ۙ:[B

    .line 1089
    iput-object p3, p0, Ll/ۚۛۚ;->᩸:Ll/᩷ۨᩴ;

    .line 1090
    iput-wide p1, p0, Ll/ۚۛۚ;->ᩴ:J

    .line 1091
    iput-boolean p5, p0, Ll/ۚۛۚ;->ۤ:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z[B)V
    .locals 2

    .line 1072
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1074
    iput-object p1, p0, Ll/ۚۛۚ;->᩷:Ljava/lang/String;

    .line 1075
    iput-object p3, p0, Ll/ۚۛۚ;->ۙ:[B

    const/4 p1, 0x0

    .line 1076
    iput-object p1, p0, Ll/ۚۛۚ;->᩸:Ll/᩷ۨᩴ;

    .line 1077
    array-length p1, p3

    int-to-long v0, p1

    iput-wide v0, p0, Ll/ۚۛۚ;->ᩴ:J

    .line 1078
    iput-boolean p2, p0, Ll/ۚۛۚ;->ۤ:Z

    return-void
.end method
