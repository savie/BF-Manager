.class public final Ll/ۜۨ;
.super Ljava/lang/Object;
.source "L1CU"


# instance fields
.field public ۙ:I

.field public ۤ:I

.field public ᩷:F

.field public final synthetic ᩸:Ll/᩷ۛ;


# direct methods
.method public constructor <init>(Ll/᩷ۛ;)V
    .locals 0

    .line 1362
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۨ;->᩸:Ll/᩷ۛ;

    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 1363
    iput p1, p0, Ll/ۜۨ;->᩷:F

    const/4 p1, -0x1

    .line 1365
    iput p1, p0, Ll/ۜۨ;->ۤ:I

    .line 1366
    iput p1, p0, Ll/ۜۨ;->ۙ:I

    return-void
.end method
