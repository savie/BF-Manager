.class public final Ll/ܿ۬ᩴ;
.super Ljava/lang/Object;
.source "HIRF"

# interfaces
.implements Ll/ۧۙܳ;


# instance fields
.field public final synthetic ۙ:Ll/᩸ۙܳ;


# direct methods
.method public constructor <init>(Ll/᩸ۙܳ;)V
    .locals 0

    .line 232
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۬ᩴ;->ۙ:Ll/᩸ۙܳ;

    return-void
.end method


# virtual methods
.method public final ۙ(Z)V
    .locals 3

    .line 235
    iget-object v0, p0, Ll/ܿ۬ᩴ;->ۙ:Ll/᩸ۙܳ;

    invoke-static {v0, p1}, Ll/᩸ۙܳ;->ۤ(Ll/᩸ۙܳ;Z)V

    const v1, 0x7f0a0183

    .line 236
    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    if-eqz p1, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const v2, 0x3e99999a    # 0.3f

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    if-eqz p1, :cond_1

    .line 238
    invoke-static {v0}, Ll/᩸ۙܳ;->ۤۙ(Ll/᩸ۙܳ;)V

    return-void

    .line 239
    :cond_1
    invoke-virtual {v0}, Ll/᩸ۙܳ;->֫()V

    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 233
    iget-object v0, p0, Ll/ܿ۬ᩴ;->ۙ:Ll/᩸ۙܳ;

    invoke-static {v0}, Ll/᩸ۙܳ;->ۜ(Ll/᩸ۙܳ;)Z

    move-result v0

    return v0
.end method
