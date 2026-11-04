.class public final Ll/᩷ۖۛ;
.super Ljava/lang/Object;
.source "X598"


# instance fields
.field public final ۙ:I

.field public final ۤ:Ll/ۤۖۛ;

.field public final ܳ:Ll/ۤۖۛ;

.field public ᩴ:Ll/᩷ۖۛ;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:Ll/ۤۖۛ;


# direct methods
.method public constructor <init>(Ll/ۤۖۛ;Ll/ۤۖۛ;Ll/ۤۖۛ;ILjava/lang/String;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Ll/᩷ۖۛ;->ܳ:Ll/ۤۖۛ;

    .line 92
    iput-object p2, p0, Ll/᩷ۖۛ;->ۤ:Ll/ۤۖۛ;

    .line 93
    iput-object p3, p0, Ll/᩷ۖۛ;->᩸:Ll/ۤۖۛ;

    .line 94
    iput p4, p0, Ll/᩷ۖۛ;->ۙ:I

    .line 95
    iput-object p5, p0, Ll/᩷ۖۛ;->᩷:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/᩷ۖۛ;Ll/ۤۖۛ;Ll/ۤۖۛ;)V
    .locals 6

    .line 106
    iget-object v3, p1, Ll/᩷ۖۛ;->᩸:Ll/ۤۖۛ;

    iget v4, p1, Ll/᩷ۖۛ;->ۙ:I

    iget-object v5, p1, Ll/᩷ۖۛ;->᩷:Ljava/lang/String;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖۛ;-><init>(Ll/ۤۖۛ;Ll/ۤۖۛ;Ll/ۤۖۛ;ILjava/lang/String;)V

    .line 107
    iget-object p1, p1, Ll/᩷ۖۛ;->ᩴ:Ll/᩷ۖۛ;

    iput-object p1, p0, Ll/᩷ۖۛ;->ᩴ:Ll/᩷ۖۛ;

    return-void
.end method
