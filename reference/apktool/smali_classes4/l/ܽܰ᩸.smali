.class public final Ll/ܽܰ᩸;
.super Ljava/lang/Object;
.source "3B3L"


# instance fields
.field public final ۙ:Ll/᩹ܽ᩵;

.field public final ۤ:Ll/᩹ܽ᩵;

.field public final ᩴ:Ll/۠᩹᩸;

.field public final ᩷:Ll/᩺۬᩹;

.field public final ᩸:Ll/ۛ᩹᩸;


# direct methods
.method public constructor <init>(Ll/᩺۬᩹;Ll/᩹ܽ᩵;)V
    .locals 1

    .line 2692
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2689
    new-instance v0, Ll/᩹ܽ᩵;

    invoke-direct {v0}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v0, p0, Ll/ܽܰ᩸;->ۤ:Ll/᩹ܽ᩵;

    .line 2691
    new-instance v0, Ll/ۛ᩹᩸;

    invoke-direct {v0}, Ll/ۛ᩹᩸;-><init>()V

    iput-object v0, p0, Ll/ܽܰ᩸;->᩸:Ll/ۛ᩹᩸;

    .line 2693
    iput-object p1, p0, Ll/ܽܰ᩸;->᩷:Ll/᩺۬᩹;

    iput-object p2, p0, Ll/ܽܰ᩸;->ۙ:Ll/᩹ܽ᩵;

    const-string p2, "inactive_save"

    .line 2694
    invoke-static {p2, p1}, Ll/۠᩹᩸;->ۙ(Ljava/lang/String;Ll/᩺۬᩹;)Ll/۠᩹᩸;

    move-result-object p1

    iput-object p1, p0, Ll/ܽܰ᩸;->ᩴ:Ll/۠᩹᩸;

    return-void
.end method
