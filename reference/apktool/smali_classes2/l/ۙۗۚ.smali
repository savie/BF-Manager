.class public final Ll/ۙۗۚ;
.super Ljava/lang/Object;
.source "L78E"


# instance fields
.field public final ֫:Ll/֡ܽۤ;

.field public final ۙ:Ll/᩶ۚ᩸;

.field public final ۚ:Ll/᩵᩹ۚ;

.field public final ۤ:Ll/ܽۚۚ;

.field public final ۫:Ll/ᩳ۫ۚ;

.field public ܳ:Ll/᩻ۤۛ;

.field public ᩴ:Ljava/lang/String;

.field public final ᩷:[C

.field public final ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۤۛۚ;)V
    .locals 1

    .line 1982
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1966
    new-instance v0, Ll/֡ܽۤ;

    invoke-direct {v0}, Ll/֡ܽۤ;-><init>()V

    iput-object v0, p0, Ll/ۙۗۚ;->֫:Ll/֡ܽۤ;

    .line 1967
    new-instance v0, Ll/᩶ۚ᩸;

    invoke-direct {v0}, Ll/᩶ۚ᩸;-><init>()V

    iput-object v0, p0, Ll/ۙۗۚ;->ۙ:Ll/᩶ۚ᩸;

    const/16 v0, 0x2000

    new-array v0, v0, [C

    .line 1968
    iput-object v0, p0, Ll/ۙۗۚ;->᩷:[C

    .line 1969
    new-instance v0, Ll/ܽۚۚ;

    invoke-direct {v0}, Ll/ܽۚۚ;-><init>()V

    iput-object v0, p0, Ll/ۙۗۚ;->ۤ:Ll/ܽۚۚ;

    .line 1971
    new-instance v0, Ll/ᩳ۫ۚ;

    invoke-direct {v0}, Ll/ᩳ۫ۚ;-><init>()V

    iput-object v0, p0, Ll/ۙۗۚ;->۫:Ll/ᩳ۫ۚ;

    .line 1972
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙۗۚ;->᩸:Ljava/util/ArrayList;

    .line 1983
    iget-object p1, p1, Ll/ۤۛۚ;->֫:Ll/ۨ᩹ۚ;

    invoke-virtual {p1}, Ll/ۨ᩹ۚ;->ۙ()Ll/᩵᩹ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙۗۚ;->ۚ:Ll/᩵᩹ۚ;

    return-void
.end method
