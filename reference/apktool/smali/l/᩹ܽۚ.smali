.class public final Ll/᩹ܽۚ;
.super Ljava/lang/Object;
.source "EIS7"


# instance fields
.field public final ۙ:Ljava/util/BitSet;

.field public final ۤ:Ll/ܳ۫ۤ;

.field public final ᩷:Ljava/util/HashSet;

.field public final ᩸:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ܳ۫ۤ;)V
    .locals 1

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/᩹ܽۚ;->᩸:Ljava/util/HashMap;

    .line 155
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩹ܽۚ;->᩷:Ljava/util/HashSet;

    .line 156
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    iput-object v0, p0, Ll/᩹ܽۚ;->ۙ:Ljava/util/BitSet;

    .line 158
    iput-object p1, p0, Ll/᩹ܽۚ;->ۤ:Ll/ܳ۫ۤ;

    return-void
.end method
