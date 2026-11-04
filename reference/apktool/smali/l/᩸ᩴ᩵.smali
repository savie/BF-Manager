.class public final Ll/᩸ᩴ᩵;
.super Ll/ܺ۠ۗ;
.source "H6C3"


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "SwitchBreakVisitor"

    return-object v0
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 2

    .line 44
    sget-object v0, Ll/᩶۟ۗ;->ܿ:Ll/᩶۟ۗ;

    invoke-static {p1, v0}, Ll/ܿ۟ۗ;->᩷(Ll/ۖۡۗ;Ll/᩶۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    new-instance v0, Ll/۠᩸᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v1, Ll/᩷ᩴ᩵;

    invoke-direct {v1, v0}, Ll/᩷ᩴ᩵;-><init>(Ljava/util/function/Supplier;)V

    invoke-static {p1, v1}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    .line 46
    new-instance v0, Ll/ۜ᩸᩵;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v1, Ll/᩷ᩴ᩵;

    invoke-direct {v1, v0}, Ll/᩷ᩴ᩵;-><init>(Ljava/util/function/Supplier;)V

    invoke-static {p1, v1}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    .line 47
    invoke-static {p1}, Ll/֡᩸᩵;->᩷(Ll/ۖۡۗ;)V

    :cond_0
    return-void
.end method
