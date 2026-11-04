.class public final Ll/ܰ᩷ܳ;
.super Ljava/lang/Object;
.source "C5GL"

# interfaces
.implements Ll/ۧۙܳ;


# instance fields
.field public final synthetic ۙ:Ll/ᩳ᩷ܳ;


# direct methods
.method public constructor <init>(Ll/ᩳ᩷ܳ;)V
    .locals 0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩷ܳ;->ۙ:Ll/ᩳ᩷ܳ;

    return-void
.end method


# virtual methods
.method public final ۙ(Z)V
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ܰ᩷ܳ;->ۙ:Ll/ᩳ᩷ܳ;

    invoke-static {v0, p1}, Ll/ᩳ᩷ܳ;->᩷(Ll/ᩳ᩷ܳ;Z)V

    invoke-static {v0, p1}, Ll/ᩳ᩷ܳ;->ۙ(Ll/ᩳ᩷ܳ;Z)V

    .line 131
    invoke-static {v0}, Ll/ᩳ᩷ܳ;->۫(Ll/ᩳ᩷ܳ;)Landroid/view/View;

    move-result-object v0

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const p1, 0x3e99999a    # 0.3f

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final ۙ()Z
    .locals 2

    .line 128
    iget-object v0, p0, Ll/ܰ᩷ܳ;->ۙ:Ll/ᩳ᩷ܳ;

    invoke-virtual {v0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, v0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1230
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
