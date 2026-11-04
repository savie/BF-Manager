.class public final Ll/ۛ᩸᩵;
.super Ll/ܺ۠ۗ;
.source "36GE"


# static fields
.field public static final ܰ:Ll/ܰ᩸᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 15
    new-instance v0, Ll/ۨ᩸᩵;

    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 15
    sput-object v0, Ll/ۛ᩸᩵;->ܰ:Ll/ܰ᩸᩵;

    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;)V
    .locals 1

    .line 23
    invoke-virtual {p0}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 26
    :cond_0
    sget-object v0, Ll/ۛ᩸᩵;->ܰ:Ll/ܰ᩸᩵;

    invoke-static {p0, v0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 0

    .line 19
    invoke-static {p1}, Ll/ۛ᩸᩵;->᩷(Ll/ۖۡۗ;)V

    return-void
.end method
