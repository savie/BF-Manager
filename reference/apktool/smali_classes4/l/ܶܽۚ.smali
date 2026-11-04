.class public final Ll/ܶܽۚ;
.super Ljava/lang/Object;
.source "EIS7"


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public final ۤ:Z

.field public final ᩷:I

.field public final ᩸:Ll/ܳ۫ۤ;


# direct methods
.method public constructor <init>(Ll/ܳ۫ۤ;IZ)V
    .locals 1

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶܽۚ;->ۙ:Ljava/util/ArrayList;

    .line 168
    iput-object p1, p0, Ll/ܶܽۚ;->᩸:Ll/ܳ۫ۤ;

    .line 169
    iput p2, p0, Ll/ܶܽۚ;->᩷:I

    .line 170
    iput-boolean p3, p0, Ll/ܶܽۚ;->ۤ:Z

    return-void
.end method
