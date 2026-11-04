.class public final Ll/ܰܺܳ;
.super Ljava/lang/Object;
.source "G6IL"

# interfaces
.implements Ll/ۙ᩻ۙ;


# instance fields
.field public final ܰ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩶ܺܳ;)V
    .locals 1

    .line 264
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 265
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܰܺܳ;->ܰ:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۤ᩻ۙ;Ll/ۡۧۙ;)V
    .locals 2

    .line 270
    sget-object v0, Ll/ۡۧۙ;->ۢ:Ll/ۡۧۙ;

    iget-object v1, p0, Ll/ܰܺܳ;->ܰ:Ljava/lang/ref/WeakReference;

    if-ne p2, v0, :cond_0

    .line 271
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ܺܳ;

    if-eqz v0, :cond_0

    .line 273
    invoke-static {v0}, Ll/᩶ܺܳ;->ܺ(Ll/᩶ܺܳ;)V

    .line 274
    invoke-static {v0}, Ll/᩶ܺܳ;->᩻(Ll/᩶ܺܳ;)Ll/֫ܽܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ܽܳ;->ۙ()V

    .line 277
    :cond_0
    sget-object v0, Ll/ۡۧۙ;->ᩳ:Ll/ۡۧۙ;

    if-ne p2, v0, :cond_2

    .line 278
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩶ܺܳ;

    if-eqz p2, :cond_1

    .line 280
    invoke-static {p2}, Ll/᩶ܺܳ;->᩻(Ll/᩶ܺܳ;)Ll/֫ܽܳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/֫ܽܳ;->᩷()V

    .line 282
    :cond_1
    invoke-interface {p1}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    return-void

    .line 285
    :cond_2
    sget-object v0, Ll/ۡۧۙ;->֨:Ll/ۡۧۙ;

    if-ne p2, v0, :cond_5

    .line 286
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩶ܺܳ;

    if-nez p2, :cond_3

    .line 288
    invoke-interface {p1}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    return-void

    .line 291
    :cond_3
    invoke-static {p2}, Ll/᩶ܺܳ;->ۧ(Ll/᩶ܺܳ;)Ll/۠ۖۧ;

    move-result-object v0

    .line 292
    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-nez v0, :cond_4

    .line 293
    invoke-interface {p1}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    return-void

    .line 296
    :cond_4
    invoke-static {p2}, Ll/᩶ܺܳ;->ܽ(Ll/᩶ܺܳ;)V

    :cond_5
    return-void
.end method
