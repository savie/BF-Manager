.class public final synthetic Ll/ܽ᩺᩸;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/۟ܰ᩸;

.field public final synthetic ܿ:Ll/ۗܰ᩸;

.field public final synthetic ᩶:Ll/֫᩶ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/۟ܰ᩸;Ll/֫᩶ᩴ;Ll/ۗܰ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ᩺᩸;->ܰ:Ll/۟ܰ᩸;

    iput-object p2, p0, Ll/ܽ᩺᩸;->᩶:Ll/֫᩶ᩴ;

    iput-object p3, p0, Ll/ܽ᩺᩸;->ܿ:Ll/ۗܰ᩸;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2764
    iget-object v0, p0, Ll/ܽ᩺᩸;->᩶:Ll/֫᩶ᩴ;

    invoke-static {v0}, Ll/᩵᩶ᩴ;->ۙ(Ll/᩷ۨᩴ;)Ll/ۗ᩶ᩴ;

    move-result-object v0

    .line 2765
    new-instance v1, Ll/ۡ᩺᩸;

    iget-object v2, p0, Ll/ܽ᩺᩸;->ܰ:Ll/۟ܰ᩸;

    iget-object v3, p0, Ll/ܽ᩺᩸;->ܿ:Ll/ۗܰ᩸;

    invoke-direct {v1, v2, v3, v0}, Ll/ۡ᩺᩸;-><init>(Ll/۟ܰ᩸;Ll/ۗܰ᩸;Ll/ۗ᩶ᩴ;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method
