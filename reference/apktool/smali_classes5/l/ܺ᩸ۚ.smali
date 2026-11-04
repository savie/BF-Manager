.class public final Ll/ܺ᩸ۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ll/֡֨֫;


# instance fields
.field public final synthetic ֡:Ll/᩹ۖ᩸;

.field public final synthetic ܰ:Ll/ܽ֡֫;

.field public final synthetic ܿ:Ll/֡ۤۚ;

.field public final synthetic ᩶:Ll/۠ۖۧ;


# direct methods
.method public constructor <init>(Ll/֡ۤۚ;Ll/۠ۖۧ;Ll/ܽ֡֫;Ll/᩹ۖ᩸;)V
    .locals 0

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺ᩸ۚ;->ܿ:Ll/֡ۤۚ;

    iput-object p2, p0, Ll/ܺ᩸ۚ;->᩶:Ll/۠ۖۧ;

    iput-object p3, p0, Ll/ܺ᩸ۚ;->ܰ:Ll/ܽ֡֫;

    iput-object p4, p0, Ll/ܺ᩸ۚ;->֡:Ll/᩹ۖ᩸;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 429
    iget-object v0, p0, Ll/ܺ᩸ۚ;->ܿ:Ll/֡ۤۚ;

    invoke-virtual {v0}, Ll/֡ۤۚ;->run()V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 2

    .line 418
    iget-object v0, p0, Ll/ܺ᩸ۚ;->ܿ:Ll/֡ۤۚ;

    invoke-virtual {v0}, Ll/֡ۤۚ;->run()V

    .line 419
    iget-object v0, p0, Ll/ܺ᩸ۚ;->᩶:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ܺ᩸ۚ;->ܰ:Ll/ܽ֡֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 420
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 0
    invoke-static {v1, v0, p1}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 423
    :cond_1
    iget-object v0, p0, Ll/ܺ᩸ۚ;->֡:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 424
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩹(I)V

    :cond_2
    :goto_0
    return-void
.end method
