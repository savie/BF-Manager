.class public final Ll/᩷ᩴ᩵;
.super Ll/ۛ᩸ۨ;
.source "H6C3"


# instance fields
.field public final ᩶:Ljava/util/function/Supplier;


# direct methods
.method public constructor <init>(Ljava/util/function/Supplier;)V
    .locals 1

    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 164
    iput-object p1, p0, Ll/᩷ᩴ᩵;->᩶:Ljava/util/function/Supplier;

    return-void
.end method


# virtual methods
.method public final ᩷(Ll/ۖۡۗ;Ll/ܿۡۗ;)V
    .locals 5

    .line 169
    instance-of v0, p2, Ll/ܰۖۗ;

    if-eqz v0, :cond_3

    .line 170
    check-cast p2, Ll/ܰۖۗ;

    .line 171
    iget-object v0, p0, Ll/᩷ᩴ᩵;->᩶:Ljava/util/function/Supplier;

    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬᩸᩵;

    .line 236
    iput-object p2, v0, Ll/۬᩸᩵;->֡:Ll/ܰۖۗ;

    const/4 v1, 0x0

    .line 177
    :goto_0
    invoke-static {p1, p2, v0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ll/ۛ᩸ۨ;)V

    .line 178
    invoke-virtual {v0}, Ll/۬᩸᩵;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 179
    invoke-virtual {v0}, Ll/۬᩸᩵;->ۤ()V

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    add-int/lit8 v3, v1, 0x1

    const/16 v4, 0x14

    if-le v1, v4, :cond_1

    const-string p2, "Unexpected iteration count in SwitchBreakVisitor. Please report as an issue"

    .line 184
    invoke-virtual {p1, p2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    return-void

    :cond_1
    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    move v1, v3

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method
