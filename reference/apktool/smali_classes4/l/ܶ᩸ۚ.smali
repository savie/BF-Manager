.class public final synthetic Ll/ܶ᩸ۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/ܽ֡֫;

.field public final synthetic ۟:Ll/֨ܶ;

.field public final synthetic ܰ:[Z

.field public final synthetic ܿ:Ll/۠ۖۧ;

.field public final synthetic ᩶:Ll/᩵᩸ۧ;


# direct methods
.method public synthetic constructor <init>(Ll/֨ܶ;Ll/ܽ֡֫;Ll/᩵᩸ۧ;Ll/۠ۖۧ;[Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, Ll/ܶ᩸ۚ;->ܰ:[Z

    iput-object p3, p0, Ll/ܶ᩸ۚ;->᩶:Ll/᩵᩸ۧ;

    iput-object p4, p0, Ll/ܶ᩸ۚ;->ܿ:Ll/۠ۖۧ;

    iput-object p2, p0, Ll/ܶ᩸ۚ;->֡:Ll/ܽ֡֫;

    iput-object p1, p0, Ll/ܶ᩸ۚ;->۟:Ll/֨ܶ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 627
    iget-object v0, p0, Ll/ܶ᩸ۚ;->ܰ:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, v1

    .line 628
    iget-object v0, p0, Ll/ܶ᩸ۚ;->᩶:Ll/᩵᩸ۧ;

    if-eqz v0, :cond_0

    .line 629
    invoke-virtual {v0, v1}, Ll/᩵᩸ۧ;->ۤ(Z)V

    .line 631
    :cond_0
    iget-object v0, p0, Ll/ܶ᩸ۚ;->ܿ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܶ᩸ۚ;->֡:Ll/ܽ֡֫;

    invoke-static {v0}, Ll/۟۠ۧ;->ۙ(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 632
    iget-object v1, p0, Ll/ܶ᩸ۚ;->۟:Ll/֨ܶ;

    invoke-virtual {v1, v0}, Ll/֨ܶ;->setChecked(Z)V

    :cond_1
    return-void
.end method
